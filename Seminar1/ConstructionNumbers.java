package Seminar1;

public class ConstructionNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int result = power(a, b);
        System.out.println(result);
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}