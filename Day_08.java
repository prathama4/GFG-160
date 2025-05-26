

public class Day_08{
    public static int maximumProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 10, 1, 3, 6, 9, 2};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 3, 6, 9, 11};
        System.out.println(maximumProfit(prices1)); // 8
        System.out.println(maximumProfit(prices2)); // 0
        System.out.println(maximumProfit(prices3)); // 10
    }
}