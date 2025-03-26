import java.util.Scanner;

public class Ass5Prob5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int N = scanner.nextInt();
        int[][] weights = new int[N][];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter the number of weights for person " + (i + 1) + ": ");
            int weightCount = scanner.nextInt();
            weights[i] = new int[weightCount];
            System.out.println("Enter " + weightCount + " weights for person " + (i + 1) + ":");
            for (int j = 0; j < weightCount; j++) {
                weights[i][j] = scanner.nextInt();
            }
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enter a weight for a person");
            System.out.println("2. Find the minimum weight of a person");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enterWeight(weights, scanner);
                    break;
                case 2:
                    System.out.print("Enter the person number (1 to " + N + "): ");
                    int person = scanner.nextInt();
                    if (person < 1 || person > N) {
                        System.out.println("Invalid person number!");
                    } else {
                        int minWeight = findMinWeight(weights[person - 1]);
                        System.out.println("Minimum weight of person " + person + ": " + minWeight);
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void enterWeight(int[][] weights, Scanner scanner) {
        System.out.print("Enter the person number: ");
        int person = scanner.nextInt();
        if (person < 1 || person > weights.length) {
            System.out.println("Invalid person number!");
            return;
        }
        System.out.print("Enter the new weight: ");
        int newWeight = scanner.nextInt();
        int[] oldWeights = weights[person - 1];
        int[] newWeights = new int[oldWeights.length + 1];
        System.arraycopy(oldWeights, 0, newWeights, 0, oldWeights.length);
        newWeights[newWeights.length - 1] = newWeight;
        weights[person - 1] = newWeights;
        System.out.println("Weight added successfully!");
    }

    public static int findMinWeight(int[] personWeights) {
        if (personWeights.length == 0) {
            System.out.println("No weights available for this person.");
            return Integer.MAX_VALUE;
        }
        int minWeight = personWeights[0];
        for (int weight : personWeights) {
            if (weight < minWeight) {
                minWeight = weight;
            }
        }
        return minWeight;
    }
}
