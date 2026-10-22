
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String sentence = sc.nextLine();
            String keyword = sc.nextLine();

            sentence = sentence.trim();
            String[] words = sentence.split(" +");

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i].toLowerCase();

                if (i == 0) {
                    word = Character.toUpperCase(word.charAt(0))
                            + word.substring(1);
                }

                if (i > 0) {
                    sb.append(" ");
                }

                sb.append(word);
            }

            String shortest = words[0].toLowerCase();
            int keywordCount = 0;

            for (String word : words) {
                String lowerWord = word.toLowerCase();

                if (lowerWord.length() < shortest.length()) {
                    shortest = lowerWord;
                }

                if (lowerWord.equalsIgnoreCase(keyword)) {
                    keywordCount++;
                }
            }

            int vowels = 0;

            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);

                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels++;
                }
            }

            System.out.println("Sentence: " + sb);
            System.out.println("Words: " + words.length);
            System.out.println("Shortest word: " + shortest);
            System.out.println("Keyword count: " + keywordCount);
            System.out.println("Vowels: " + vowels);
        }
    }
}