
class Day_12{

    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int totalSum = arr[0]; // FIXED HERE
        int maxSum = arr[0], currMax = arr[0];
        int minSum = arr[0], currMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);

            totalSum += num; // ACCUMULATE TOTAL SUM
        }

        if (maxSum < 0) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }

    // Main method for testing
    public static void main(String[] args) {
        Day_12 day12 = new Day_12();
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println("Maximum Circular Subarray Sum: " + day12.circularSubarraySum(arr));
    }
}