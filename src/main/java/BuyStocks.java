public class BuyStocks {

    private static int[] prices = {7,1,5,3,6,4};
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Ex1.
In: prices = [7,1,5,3,6,4]
Out: 5

Ex2.
In: prices = [7,6,4,3,1]
Out: 0
     */
    public static int getMaxProfit() {
        //int[] prices = {7,1,5,3,6,4};
        int profit = 0;
        int finalProfit = 0;
        for (int i=0;i<prices.length;i++){
            for (int j=i; j< prices.length; j++){
                if (prices[i] < prices[j]){
                    System.out.println("profit has " + profit);
                    profit = prices[j] - prices[i];
                    if (profit > finalProfit){
                        finalProfit = profit;

                    }
                }
            }
        }
        return finalProfit;
    }

    public static void main(String[] args) {
        System.out.println(getMaxProfit());
    }
}
