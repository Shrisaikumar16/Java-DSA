public class BuySellStocks {

    // public static int buyAndSellStocks(int prices[]) {

    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for (int i=0; i<prices.length; i++) {
    //         if (buyPrice < prices[i]) {
    //             int profit = prices[i] - buyPrice;
    //             maxProfit = Math.max(maxProfit, profit);
    //         } else {
    //             buyPrice = prices[i];
    //         }
    //     }
    //     return maxProfit;
    // }

    // public static void main(String args[]) {
    //     int prices[] = {7, 1, 5, 3, 6, 4, 10};
    //     System.out.println(buyAndSellStocks(prices));
    //   }



    public static int buySell(int prices[]) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++) {
            if(buy < prices[i]) {
                int profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

    public static int buysell(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else {
                int profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {2,7,1,9,6,8,3,6,0,3};
        System.out.println(buySell(prices));
        System.out.println(buysell(prices));

    }

}
