package Seminar2;

public class CompressStrings {
    public static void main(String[] args) {
        String input = "aaaabbbcdd";
        String compressedString = compressString(input);
        System.out.println(compressedString);
    }

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        return compressed.toString();
    }
}
