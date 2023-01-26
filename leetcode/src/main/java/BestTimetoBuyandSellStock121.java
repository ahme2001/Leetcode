public class BestTimetoBuyandSellStock121 {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int max = 0,start = 0,second = 1;
        while (second < prices.length){
            int diff = prices[second]-prices[start];
            if(diff < 0){
                start = second;
            }else{
                max = Math.max(max,diff);
            }
            second++;
        }
        return max;
    }
}
