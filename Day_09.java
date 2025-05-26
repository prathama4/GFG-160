//Day9 

import java.util.*;

public class Day_09 {
    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);
            if (min >= 0)
                ans = Math.min(ans, max - min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 10};
        int[] arr2 = {3, 9, 12, 16, 20};
        System.out.println(getMinDiff(arr1, 2)); // 5
        System.out.println(getMinDiff(arr2, 3)); // 11
    }
}
