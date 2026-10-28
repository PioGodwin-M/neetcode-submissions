class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int ans=0;
        for(int i=1;i<prices.length;i++){
            int d=0;
            if(prices[i]>min){
            d=prices[i]-min;
            ans=Math.max(d,ans);
            }
            min=Math.min(min,prices[i]);
        }
        return ans;
    }
}
