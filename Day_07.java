 public class Day_07 {
        public static int maximumProfit(int[] prices) {
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }
    
        public static void main(String[] args) {
            int[] prices1 = {100, 180, 260, 310, 40, 535, 695};
            int[] prices2 = {4, 2, 2, 2, 4};
            System.out.println(maximumProfit(prices1)); // 865
            System.out.println(maximumProfit(prices2)); // 2
        }
    }
    

