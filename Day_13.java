//day13

class Day_13{
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        int n = arr.length;

        // Step 1: Place each number at its correct index (1-based)
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Step 2: Find the first index i such that arr[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // All numbers from 1 to n are present
        return n + 1;
    }

    public static void main(String[] args) {
          Day_13 sol = new Day_13();

        int[] arr1 = {2, -3, 4, 1, 1, 7};
        System.out.println("Missing number: " + sol.missingNumber(arr1));  // Output: 3

        int[] arr2 = {5, 3, 2, 5, 1};
        System.out.println("Missing number: " + sol.missingNumber(arr2));  // Output: 4

        int[] arr3 = {-8, 0, -1, -4, -3};
        System.out.println("Missing number: " + sol.missingNumber(arr3));  // Output: 1
    }
}