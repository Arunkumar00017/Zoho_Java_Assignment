package Assignment2;

import java.util.Scanner;

enum Weekday {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }
    public class Ass2Prob5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (1-7) for the weekday: ");
            int dayNumber = scanner.nextInt();
            if (dayNumber < 1 || dayNumber > 7) {
                System.out.println("Invalid input! Enter a number between 1 and 7.");
            } else {
                Weekday[] day = Weekday.values();
                System.out.println("The day is: " + day[dayNumber - 1]);
            }
        }
    }