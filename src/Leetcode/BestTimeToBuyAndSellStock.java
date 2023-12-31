package Leetcode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] array = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maximumProfit = 0, minStockVal = Integer.MAX_VALUE;
        int i = 0;
        while (i < n) {
            minStockVal = Math.min(minStockVal, prices[i]);
            // whenever the price of current stock is greater then then the stock value which we bought then only we will sell the stock
            if (prices[i] >= minStockVal)
                maximumProfit = Math.max(maximumProfit, prices[i] - minStockVal);
            i++;
        }
        return maximumProfit;
    }
}
