package pl.byrka.service.impl;

import pl.byrka.dto.Pairs;
import pl.byrka.dto.TaskAnswerResponse;
import pl.byrka.dto.TaskThreeRequest;
import pl.byrka.service.TaskAnswer;

import java.util.List;

public class TaskThreeAnswer extends TaskAnswer {
    @Override
    public TaskAnswerResponse resolveTask(List<Integer> numbersToTask) {
        return TaskAnswerResponse.builder().build();
    }

    @Override
    public TaskAnswerResponse resolveTaskThree(TaskThreeRequest request) {
        return TaskAnswerResponse.builder().build();
    }
}
