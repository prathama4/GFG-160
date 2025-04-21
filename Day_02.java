import java.util.Scanner;

public class Day_02 {

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill the rest of the array with zeros
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Get array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        moveZerosToEnd(arr);

        // Print the result
        System.out.print("Array after moving zeros to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
