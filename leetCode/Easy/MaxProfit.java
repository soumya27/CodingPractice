//Link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package leetCode.Easy;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max =0;
        for (int i =0 ; i<prices.length ;i++){
            if(prices[i]< min){
                min = prices[i];
            }
            else{
                max = prices[i]-min > max ? prices[i]-min: max;
            }
        }
        return max;
    }
}
