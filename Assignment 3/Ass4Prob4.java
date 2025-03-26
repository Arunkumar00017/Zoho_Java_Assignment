import java.util.Scanner;

public class Ass4Prob4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.print("Enter the number to find its second occurrence: ");
            int target = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == target) {
                    count++;
                    if (count == 2) {
                        System.out.println("Second occurrence found at index: " + i);
                        scanner.close();
                        return;
                    }
                }
            }
            System.out.println("Number does not have a second occurrence.");
            scanner.close();
        }
    }

