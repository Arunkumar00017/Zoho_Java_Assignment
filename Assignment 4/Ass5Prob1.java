//Create a program that rotates the elements of an array to the right by a specified
// number of positions. Get the array and the rotation count from the user

import java.util.Scanner;
public class Ass5Prob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int k = scanner.nextInt();
        k = k % size;
        rotateRight(arr, k);
        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, n - 1);//1,2,3,4,5,6,7,8,9,10//10,9,8,7,6,5,4,3,2,1
        reverse(arr, 0, k - 1);//8,9,10,7,6,5,4,3,2,1
        reverse(arr, k, n - 1);//8,9,10,1,2,3,4,5,6,7
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
