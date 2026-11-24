class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int bPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
             bPrice = Math.min(bPrice, prices[i]);
             maxProfit = Math.max(maxProfit, prices[i] - bPrice);
        }
        return maxProfit;
    }
}
