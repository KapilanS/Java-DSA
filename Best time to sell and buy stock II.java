class Solution {
    public int maxProfit(int[] prices) {
        int minval=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minval){
                minval=prices[i];
            }
            else{
                maxprofit+=prices[i]-minval;
                minval=prices[i];
            }
        }
        return maxprofit;
    }
}
