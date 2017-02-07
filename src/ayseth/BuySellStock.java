package ayseth;

/**
 * Created by ayseth on 07/02/17.
 *
 * Best time to buy and sell stocks.
 * 1) Only 1 transaction is allowed
 * Time complexity O(n)
 * Space complexity O(1)
 *
 */
public class BuySellStock {

    int buySellStock(int[] prices){

        if(prices.length==0)
            return 0;
        int min=prices[0];
        int max=prices[0];
        int minplace=0;
        int maxplace=0;
        for(int j=0;j<prices.length;j++){
            if(prices[j]<min){
                min=prices[j];
                minplace=j;
            }
            if(prices[j]>max){
                max=prices[j];
                maxplace=j;
            }
        }
        int localmax=prices[minplace];
        int localmin=prices[maxplace];
        for(int j=minplace;j<prices.length;j++){
            if(prices[j]>localmax){
                localmax=prices[j];
            }
        }
        for(int j=0;j<maxplace;j++){
            if(prices[j]<localmin){
                localmin=prices[j];
            }
        }
        int i=max-localmin;
        int j=localmax-min;
        if(i>=j)
            return i;
        else
            return j;
    }

    public static void main(String[] args){

        BuySellStock maxprofit=new BuySellStock();
        int prices[]={6,4,1,3,5,7,3,1,3,4,7,9,2,5,6,0,1,2};
        System.out.println("The max profit is"+maxprofit.buySellStock(prices));
    }

}
