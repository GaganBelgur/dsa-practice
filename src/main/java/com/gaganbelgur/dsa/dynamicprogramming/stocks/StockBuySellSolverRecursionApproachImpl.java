package main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks;

public class StockBuySellSolverRecursionApproachImpl implements StocksBuySellSolverInterface {
    @Override
    public int stockBuySell(int[] arr, int n) {
        if(n==0) return 0;

        return buyStocks(0, 0, n, arr);
    }

    private int buyStocks(int index, int buy, int n, int[] arr) {
        if(index == n) return 0;

        int profit = 0;

        if(buy == 0) {
            int bought = -1 * arr[index] + buyStocks(index + 1, 1, n, arr);
            int notBought = 0 + buyStocks(index + 1, 0, n, arr);
            profit = Math.max(bought, notBought);
        }

        if(buy == 1) {
            int sell = arr[index] + buyStocks(index + 1, 0, n, arr);
            int notSell = 0 + buyStocks(index + 1, 1, n, arr);
            profit = Math.max(sell, notSell);
        }

        return profit;
    }
}
