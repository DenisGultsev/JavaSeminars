package Seminar2;

public class Gems {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = countJewels(jewels, stones);
        System.out.println(result);
    }

    public static String countJewels(String jewels, String stones) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == jewel) {
                    count++;
                }
            }
            result.append(jewel).append(count);
        }
        return result.toString();
    }
}