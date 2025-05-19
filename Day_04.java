//gfg4

import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter number of rotations (d): ");
        int d = sc.nextInt();

        
        Solution.rotateArr(arr, d);

        
        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

class Solution {
    
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // Handle case where d > n

        
        reverse(arr, 0, d - 1);

       
        reverse(arr, d, n - 1);

        
        reverse(arr, 0, n - 1);
    }

    
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}