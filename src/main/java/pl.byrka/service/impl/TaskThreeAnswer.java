package pl.byrka.service.impl;

import pl.byrka.dto.Pairs;
import pl.byrka.dto.TaskAnswerResponse;
import pl.byrka.dto.TaskThreeRequest;
import pl.byrka.dto.TaskThreeResponse;
import pl.byrka.service.TaskAnswer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskThreeAnswer extends TaskAnswer {
    @Override
    public TaskAnswerResponse resolveTask(List<Integer> numbersToTask) {
        return TaskAnswerResponse.builder().build();
    }

    @Override
    public TaskAnswerResponse resolveTaskThree(TaskThreeRequest request) {
        Collections.sort(request.getNumbers());
        List<Pairs> pairs = new ArrayList<>();
        int diagramCount = 0;

        for (int i = 0; i <= (request.getCount()+1); i++) {
            int helper =  i + 1;
            pairs.add(Pairs.builder()
                    .firstNumber(request.getNumbers().get(i))
                    .secondNumber(request.getNumbers().get(helper))
                    .build());
            i++;
        }
        for (int i = 0; i < request.getCount() -1; i++) {
            if ((pairs.get(i).getSecondNumber()+1) != pairs.get(i+1).getFirstNumber())
                diagramCount++;
        }


        return TaskAnswerResponse.builder()
                .taskThereResponse(TaskThreeResponse.builder()
                        .answerThree(diagramCount)
                        .build())
                .build();
    }
}
