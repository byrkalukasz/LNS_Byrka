package pl.byrka.enums;

public enum TaskEnum {

    TASK1("task_1.txt"),
    TASK2("task_2.txt"),
    TASK3("task_3.txt");

    private String task;

    TaskEnum(String task) {
        this.task = task;
    }

    public String gettDescription() {return task;}
}
