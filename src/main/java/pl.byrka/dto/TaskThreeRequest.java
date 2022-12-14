package pl.byrka.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class TaskThreeRequest {
    private Integer count;
    private List<Integer> numbers;
}
