package Seminar2;

public class StringShuffler {
    public static String shuffleString(String s, int[] index) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[index[i] - 1] = s.charAt(i);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String s = "gda";
        int[] index = { 3, 2, 1 };
        String result = shuffleString(s, index);
        System.out.println(result);
    }
}
