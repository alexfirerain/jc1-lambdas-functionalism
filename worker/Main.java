package worker;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker(System.out::println, System.out::println);

        worker.work(100, Set.of(33)); // можно закончить ошибкой любое кол-во задач через запятую
    }
}
