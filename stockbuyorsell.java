import java.util.*;

public class stockbuyorsell {
    public static int stockprice(int stock[]){
        int buyingprice=Integer.MAX_VALUE;
        int profit;
        int maxprofit=0;
        for (int i = 0; i < stock.length; i++) {
            if(buyingprice<stock[i]) {//profit
                profit=stock[i]-buyingprice;//today's profit
                maxprofit=Math.max(maxprofit, profit);//maximum global price
            }
            
            else{
                buyingprice=stock[i];
           }
        }
        return maxprofit;
    }

    public static void main(String arg[]) {
        int stock[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print("the max profit I'll get is when the price of the stock is : "+ stockprice(stock));
        
    }
}
