package pl.byrka.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class TaskOneResponse {
    private List<Integer> sortedList;
    private Long count;
    private List<Integer> distinct;
    private Integer min;
    private Integer max;

    public TaskOneResponse(List<Integer> sortedList, Long count, List<Integer> distinct, Integer min, Integer max) {
        this.sortedList = sortedList;
        this.count = count;
        this.distinct = distinct;
        this.min = min;
        this.max = max;
    }
}
