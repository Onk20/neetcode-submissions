class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];

        int maxProfit = 0;

        // for(int i=1; i<prices.length; i++){

            
        //     int profit = prices[i] - min;
        //     maxProfit = Math.max(profit, maxProfit);

        //     min = Math.min(min, prices[i]);

        // }

        // return maxProfit;

        int l = 0, r = 1;

        while(r < prices.length){

            if(prices[l] < prices[r]){

                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                l = r;
            }
            r++;
        }

        return maxProfit;
    }
}
