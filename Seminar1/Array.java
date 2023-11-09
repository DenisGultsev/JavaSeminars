package Seminar1;

public class Array {
    public static void main(String[] args) {
        int[] binaryArray = { 1, 1, 0, 1, 1, 1 };
        int maxConsecutiveOnes = getMaxConsecutiveOnes(binaryArray);
        System.out.println("Максимальное количество подряд идущих 1: " + maxConsecutiveOnes);
    }

    public static int getMaxConsecutiveOnes(int[] binaryArray) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }

        return maxConsecutiveOnes;
    }
}