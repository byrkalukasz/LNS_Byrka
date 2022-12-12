package pl.byrka.service;

import pl.byrka.dto.Pairs;
import pl.byrka.dto.TaskAnswerResponse;
import pl.byrka.dto.TaskThreeRequest;

import java.util.List;

public abstract class TaskAnswer {
    public abstract TaskAnswerResponse resolveTask(List<Integer> numbersToTask);
    public abstract TaskAnswerResponse resolveTaskThree(TaskThreeRequest request);
}
