class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int maxProfit = 0;
        int currentProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] <= bestBuy){
                bestBuy = prices[i];
            }
            else{
                currentProfit = prices[i] - bestBuy;
                if(currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}