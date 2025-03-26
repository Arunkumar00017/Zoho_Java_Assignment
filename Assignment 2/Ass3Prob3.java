import java.util.Scanner;
public class Ass3Prob3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.println("Bitwise AND: " + (num1 & num2));
            System.out.println("Bitwise OR: " + (num1 | num2));
            System.out.println("Bitwise XOR: " + (num1 ^ num2));
            System.out.println("Left Shift of first number by 1: " + (num1 << 1));
            System.out.println("Right Shift of first number by 1: " + (num1 >> 1));
            scanner.close();
        }
    }

