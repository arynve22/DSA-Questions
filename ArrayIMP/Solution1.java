public class Solution1 {
    public static int maxProfit(int[] prices) {
        int maxProfits = 0;
        int buyPrices=Integer.MAX_VALUE;

        for( int i=0; i<prices.length ; i++){
            if ( buyPrices < prices[i]) {
            int profit=prices[i] - buyPrices;
            maxProfits = Math.max(maxProfits , profit);
        }
            else{
                buyPrices=prices[i];
            }
        }
        return maxProfits;
    }
 public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
       
        System.out.println(maxProfit(prices));
    }
} 