
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String keyword = sc.nextLine();
        int vowels = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = Character.toLowerCase(line.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        String trimmed = line.trim();
        String[] words = trimmed.split(" +");

        int wordCount = words.length;
        int keywordCount = 0;
        String shortest = words[0].toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wordCount; i++) {
            String word = words[i].toLowerCase();

            if (i == 0) {
                word = Character.toUpperCase(word.charAt(0))
                        + word.substring(1);
            }

            if (i > 0) {
                sb.append(" ");
            }
            sb.append(word);
            if (words[i].length() < shortest.length()) {
                shortest = words[i].toLowerCase();
            }

            if (words[i].equalsIgnoreCase(keyword)) {
                keywordCount++;
            }
        }

        System.out.println("Sentence: " + sb);
        System.out.println("Words: " + wordCount);
        System.out.println("Shortest word: " + shortest);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Vowels: " + vowels);

        sc.close();
    }
}
