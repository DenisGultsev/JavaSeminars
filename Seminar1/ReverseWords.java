package Seminar1;

public class ReverseWords {
    public static void main(String[] args) {
        String phrase = "Добро пожаловать на курс по Java";
        String reversedPhrase = reverseWords(phrase);
        System.out.println(reversedPhrase);
    }

    public static String reverseWords(String phrase) {
        String[] words = phrase.split(" ");
        StringBuilder reversedPhrase = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedPhrase.append(words[i]);
            if (i > 0) {
                reversedPhrase.append(" ");
            }
        }

        return reversedPhrase.toString();
    }
}