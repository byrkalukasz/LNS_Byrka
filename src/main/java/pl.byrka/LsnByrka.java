package pl.byrka;

import pl.byrka.service.TaskStrategy;
import pl.byrka.service.impl.TaskStrategyImpl;

public class LsnByrka {

    public static void main(String[] args) {
        TaskStrategyImpl strategy = new TaskStrategyImpl();
        strategy.getFileReaderStrategyAndService();
    }
}
