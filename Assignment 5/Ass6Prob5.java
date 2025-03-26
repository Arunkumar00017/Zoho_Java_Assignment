import java.util.Scanner;

public class Ass6Prob5 {
    public static String capitalizeEachWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()&& word.charAt(0)>96) {
                capitalizedSentence.append((char)((word.charAt(0))-32))
                        .append(word.substring(1))
                        .append(" ");
            }
            else
                capitalizedSentence.append(word+" ");
        }

        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String capitalizedSentence = capitalizeEachWord(sentence);
        System.out.println("Capitalized Sentence: " + capitalizedSentence);
    }
}
