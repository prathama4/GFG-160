//gfg5

import java.util.Scanner;

public class NextPermutationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input elements
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get next permutation
        Solution.nextPermutation(arr);

        // Output result
        System.out.println("Next permutation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

class Solution {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find first decreasing element from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find next greater element on right of arr[i]
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Step 3: Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // Step 4: Reverse the suffix starting at i+1
        reverse(arr, i + 1, n - 1);
    }

    // Swap helper
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse helper
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}