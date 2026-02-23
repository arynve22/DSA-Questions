import java.util.*;

//leedcode Question no 121 Best Time to buy stock and sell
public class Stockbuysell {

    public static int buYStockSell(int prices[]){
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for( int i=0 ; i<prices.length ; i++){
            
            if(buyPrices < prices[i]){ //profit calculate   
                int profit = prices[i] - buyPrices; //Today's Profit 
                maxProfit = Math.max(maxProfit, profit);
            }
              else{
                buyPrices = prices[i];
              }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buYStockSell(prices));
    }

}   