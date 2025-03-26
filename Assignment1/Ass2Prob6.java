package Assignment2;

import java.util.Scanner;

public class Ass2Prob6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double totalWeight = 0.0;
            int numberOfPeople = 10;
            for (int i = 1; i <=  numberOfPeople; i++) {
                System.out.print("Enter weight of person " + i + ": ");
                double weight = sc.nextDouble();
                totalWeight += weight;
            }
            double averageWeight = totalWeight /  numberOfPeople;
            System.out.println("The average weight of " +  numberOfPeople+ " people is: " + averageWeight + " kg");
        }
    }
