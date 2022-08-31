package slideWindow;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 *121. Best Time to Buy and Sell Stock
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [7,2,1,5,3,6,4]
 * Output: 5
 *
 *
 *
 *  i = 0
 *      7
 *
 *  i = 1
 *      1
 *
 */
public class BestTimeToBuyAndSellStock {


    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        if (prices.length <= 1) {
            return maxProfit;
        }

        int i =0 , j = 1;
        while (j<prices.length){
            if (prices[i] < prices[j]){
                maxProfit = Math.max(maxProfit,prices[j] - prices[i]);
                j++;
            } else {
                i++;
                if (i >=j ){
                    j++;
                }
            }
        }




        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,2,1,5,3,6,4}));
    }
}
