class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > price ) {
                maxProfit += prices[i] - price;
            }
            price = prices[i];
        }
        return maxProfit;
    }
}


// class Solution {
//     public int maxProfit(int[] prices) {
//         int profit=0;
//         for(int i=1;i<prices.length;i++){
//             // if(prices[i]-prices[i-1]>0){
//             //     profit=profit+prices[i]-prices[i-1];
//             // }
//             if(prices[i]>prices[i-1]){
//                 profit=profit+prices[i]-prices[i-1];
//             }
//         }
//         return profit;
//     }
// }