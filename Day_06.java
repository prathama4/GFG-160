import java.util.*;

public class Day_06{
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Integer candidate1 = null, candidate2 = null;
        int count1 = 0, count2 = 0;

        // First pass: find possible candidates
        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass: verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        Collections.sort(result); // Sort in increasing order
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(majorityElement(arr1)); // Output: [5, 6]
        System.out.println(majorityElement(arr2)); // Output: []
    }
}