package Seminar1;

import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();

        int triangularNumber = calculateTriangularNumber(n);
        int factorial = calculateFactorial(n);

        System.out.println("Треугольное число: " + triangularNumber);
        System.out.println("Факториал: " + factorial);
    }

    public static int calculateTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}