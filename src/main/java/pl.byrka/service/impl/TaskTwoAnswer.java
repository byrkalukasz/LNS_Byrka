package pl.byrka.service.impl;

import pl.byrka.dto.Pairs;
import pl.byrka.dto.TaskAnswerResponse;
import pl.byrka.dto.TaskThreeRequest;
import pl.byrka.dto.TaskTwoResponse;
import pl.byrka.service.TaskAnswer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TaskTwoAnswer extends TaskAnswer {
    @Override
    public TaskAnswerResponse resolveTask(List<Integer> numbersToTask) {
        List<Pairs> pairs = new ArrayList<Pairs>();
        HashMap<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
        int i = 0;
        int target = 13;
        Collections.sort(numbersToTask);
        numbersToTask.forEach(number -> {
            numbersMap.put(number, number);
        });


        while (i < numbersToTask.size() - 1) {
            int searchedNumber = target - numbersToTask.get(i);
            if (numbersMap.containsKey(searchedNumber))
                pairs.add(Pairs.builder()
                        .firstNumber(numbersToTask.get(i))
                        .secondNumber(searchedNumber)
                        .build());
            i++;

        }
        return TaskAnswerResponse.builder()
                .taskTwoResponse(TaskTwoResponse.builder()
                        .pairs(pairs)
                        .build())
                .build();
    }

    @Override
    public TaskAnswerResponse resolveTaskThree(TaskThreeRequest request) {
        return TaskAnswerResponse.builder().build();
    }
}
