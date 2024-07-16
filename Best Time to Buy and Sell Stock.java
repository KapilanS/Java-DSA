class Solution {
    public int maxProfit(int[] prices) {
        int minval=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minval){
                minval=prices[i];
            }
            else{
                int profit = prices[i]-minval;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
}
