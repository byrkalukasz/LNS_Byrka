package pl.byrka.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class TaskAnswerResponse {

    private TaskOneResponse taskOneResponse;
    private TaskTwoResponse taskTwoResponse;
    private TaskThreeResponse taskThereResponse;

    public TaskAnswerResponse(TaskOneResponse taskOneResponse, TaskTwoResponse taskTwoResponse, TaskThreeResponse taskThereResponse) {
        this.taskOneResponse = taskOneResponse;
        this.taskTwoResponse = taskTwoResponse;
        this.taskThereResponse = taskThereResponse;
    }
}
