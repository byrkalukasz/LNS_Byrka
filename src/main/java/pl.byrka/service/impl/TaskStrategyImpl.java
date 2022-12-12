package pl.byrka.service.impl;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import pl.byrka.dto.TaskAnswerResponse;
import pl.byrka.dto.TaskOneResponse;
import pl.byrka.dto.TaskThreeRequest;
import pl.byrka.enums.TaskEnum;
import pl.byrka.service.TaskAnswer;
import pl.byrka.service.TaskStrategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskStrategyImpl implements TaskStrategy {

    private TaskAnswer taskAnswer;

    public TaskStrategyImpl() {
        this.taskAnswer = null;
    }

    @Override
    public void getFileReaderStrategyAndService() {
        TaskAnswerResponse response;
        File folder = new File("data\\");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            //log.info("Determinate strategy and answer for file " + file.getName());
            getInstanceOfTaskAnswer(file);
            if (!file.getName().equals(TaskEnum.TASK3)) {
                response = taskAnswer.resolveTask(readFromFile(file));
                showResponse(response, file);
            } else {
                response = taskAnswer.resolveTaskThree(readFromFileForTaskThree());
                showResponse(response, file);
            }
        }
    }

    private void getInstanceOfTaskAnswer(File file) {
        if (file.getName().equals(TaskEnum.TASK1.gettDescription()))
            taskAnswer = new TaskOneAnswer();
        if (file.getName().equals(TaskEnum.TASK2.gettDescription()))
            taskAnswer = new TaskTwoAnswer();
        if (file.getName().equals(TaskEnum.TASK3.gettDescription()))
            taskAnswer = new TaskThreeAnswer();
    }

    private List<Integer> readFromFile(File file) {
        List<Integer> numbers = new ArrayList<>();
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
                if (reader.hasNextInt())
                    numbers.add(reader.nextInt());
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred.");
        }
        return numbers;
    }

    private TaskThreeRequest readFromFileForTaskThree() {
        List<Integer> numbers = new ArrayList<>();
        Integer count;

        return TaskThreeRequest.builder()
                .count(null)
                .numbers(null)
                .build();
    }

    private void showResponse(TaskAnswerResponse response, File file){
        if (file.getName().equals(TaskEnum.TASK1.gettDescription()))
            System.out.println(response.getTaskOneResponse());
        if (file.getName().equals(TaskEnum.TASK2.gettDescription()))
            System.out.println(response.getTaskTwoResponse());
        if (file.getName().equals(TaskEnum.TASK3.gettDescription()))
            System.out.println(response.getTaskThereResponse());
    }
}
