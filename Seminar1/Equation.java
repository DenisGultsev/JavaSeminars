package Seminar1;

public class Equation {
    public static void main(String[] args) {
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    if (isValidEquation(q, w, e)) {
                        System.out.println(q + " + " + w + " = " + e);
                        return;
                    }
                }
            }
        }

        System.out.println("Решение не найдено");
    }

    public static boolean isValidEquation(int q, int w, int e) {
        String equation = q + "?" + " + " + "?" + w + " = " + e;
        equation = equation.replace("?", "[0-9]");

        return (q + w == e) && (equation.matches("[0-9]+ \\+ [0-9]+ = [0-9]+"));
    }
}