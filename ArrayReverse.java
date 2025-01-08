import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Initialize the array and take user input
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reverse the array using the method
        reverseArray(arr);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));

        scanner.close();
    }
}
 