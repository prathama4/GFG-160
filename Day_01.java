import java.util.Scanner;

public class Day_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements (positive integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Solution.getSecondLargest(arr);

        if (result == -1) {
            System.out.println("Second largest element doesn't exist.");
        } else {
            System.out.println("Second largest element is: " + result);
        }
    }
}

class Solution {
    public static int getSecondLargest(int[] arr) {
        int A = -1, B = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > A) {
                B = A;
                A = arr[i];
            } else if (arr[i] < A && arr[i] > B) {
                B = arr[i];
            }
        }

        return B;
    }
}