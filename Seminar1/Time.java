package Seminar1;

import java.time.LocalTime;
import java.util.Scanner;

public class Time {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (// Запросить имя пользователя
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ваше имя: ");
            String name = scanner.nextLine();

            // Получить текущее время
            LocalTime currentTime = LocalTime.now();

            // Определить приветствие в зависимости от текущего времени
            String greeting;
            if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(11, 59))) {
                greeting = "Доброе утро";
            } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(17, 59))) {
                greeting = "Добрый день";
            } else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(22, 59))) {
                greeting = "Добрый вечер";
            } else {
                greeting = "Доброй ночи";
            }

            // Вывести приветствие с именем пользователя
            System.out.println(greeting + ", " + name + "!");
        }
    }
}
