import java.util.Scanner;

public class Ass6Prob1 {
    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
