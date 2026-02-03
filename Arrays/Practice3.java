public class Practice3 {

    public static int MaxProfit(int prices[]) {
        int curr = prices[0];
        int profit = 0;
        int max = 0;

        for (int i=1; i<prices.length; i++) {
            if (curr > prices[i]) {
                curr = prices[i];
            } else {
                profit = prices[i] - curr;
                max = Math.max(max, profit);
            }

        }
        return max;
    }
    public static void main(String args[]) {
        int prices[] = {15, 7, 2, 5, 3, 6, 4, 8, 20};
        int profit = MaxProfit(prices);
        System.out.println(profit);
    }
}
