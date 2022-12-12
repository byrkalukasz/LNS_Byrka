package pl.byrka.service.impl;

import pl.byrka.dto.TaskAnswerResponse;
import pl.byrka.dto.TaskOneResponse;
import pl.byrka.dto.TaskThreeRequest;
import pl.byrka.service.TaskAnswer;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOneAnswer extends TaskAnswer {
    @Override
    public TaskAnswerResponse resolveTask(List<Integer> numberToTask) {
        Collections.sort(numberToTask);
        return TaskAnswerResponse.builder()
                .taskOneResponse(TaskOneResponse.builder()
                        .count(numberToTask.stream().count())
                        .distinct(numberToTask.stream().distinct().collect(Collectors.toList()))
                        .max(numberToTask.get(numberToTask.size() - 1))
                        .min(numberToTask.get(0))
                        .sortedList(numberToTask)
                        .build())
                .build();
    }

    @Override
    public TaskAnswerResponse resolveTaskThree(TaskThreeRequest request) {
        return TaskAnswerResponse.builder().build();
    }

}
