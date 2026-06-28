package arrays_strings.optimal;

/*
Problem: Best Time to Buy and Sell Stock

Optimal Approach:
Traverse the array once while tracking
the minimum price seen so far and the
maximum profit.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class BestTimeToBuyAndSellStockOptimal {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }
}
