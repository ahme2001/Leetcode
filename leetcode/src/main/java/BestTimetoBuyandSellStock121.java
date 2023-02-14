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

    // Optimization to function above
    public int maxProfitO(int[] prices) {
        if(prices.length <= 1) return 0;
        int max = prices[0],min = prices[0],res=0;
        for(int num:prices){
            if (num < min){
                res = Math.max(res,max-min);
                min = num;max=num;
            }else
                max = Math.max(max,num);
        }
        res = Math.max(res,max-min);
        return res;
    }
}
