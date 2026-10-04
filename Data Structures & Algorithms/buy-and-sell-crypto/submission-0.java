class Solution {
    public int maxProfit(int[] prices) {
       int cheap = prices[0];
       int maxProfit = 0;
       for(int i =1;i<prices.length;i++){
         cheap = Math.min(cheap,prices[i]);
         maxProfit = Math.max(maxProfit,prices[i]-cheap);
       } 
       return maxProfit;
    }
}
