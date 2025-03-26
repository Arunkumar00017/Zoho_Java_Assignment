import java.util.Scanner;
public class Ass4Prob2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter student's score (0-100): ");
            int score = scanner.nextInt();

            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("The student's grade is: " + grade);

            scanner.close();
        }
    }
