package Seminar2;

import java.util.Scanner;

public class LengthNumbers {
    public static void main(String[] args) {
        int N = 10; // Задайте значение четного числа N

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ c1: ");
        char c1 = scanner.next().charAt(0);
        System.out.print("Введите символ c2: ");
        char c2 = scanner.next().charAt(0);

        String result = generateString(N, c1, c2);
        System.out.println(result);
    }

    public static String generateString(int N, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }
}