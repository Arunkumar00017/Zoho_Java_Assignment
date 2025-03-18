import java.util.Scanner;

public class Ass2Prob6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double totalWeight = 0.0;
            final int NUMBER_OF_PEOPLE = 10;
            for (int i = 1; i <= NUMBER_OF_PEOPLE; i++) {
                System.out.print("Enter weight of person " + i + ": ");
                double weight = sc.nextDouble();
                totalWeight += weight;
            }
            double averageWeight = totalWeight / NUMBER_OF_PEOPLE;
            System.out.println("The average weight of " + NUMBER_OF_PEOPLE + " people is: " + averageWeight + " kg");
        }
    }
