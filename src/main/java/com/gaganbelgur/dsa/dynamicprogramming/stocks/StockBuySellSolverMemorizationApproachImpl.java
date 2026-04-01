package main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks;

import java.util.Arrays;

public class StockBuySellSolverMemorizationApproachImpl implements StocksBuySellSolverInterface {
    @Override
    public int stockBuySell(int[] arr, int n) {
        if(n==0) return 0;

        int[][] dp = new int[n][2];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }


        int profit = buyStocks(0, 0, n, arr, dp);

        return profit;
    }

    private int buyStocks(int index, int buy, int n, int[] arr, int[][] dp) {
        if(index == n) return 0;

        if(dp[index][buy] != -1) return dp[index][buy];
        int profit = 0;

        if(buy == 0) {
            int bought = -1 * arr[index] + buyStocks(index + 1, 1, n, arr, dp);
            int notBought = 0 + buyStocks(index + 1, 0, n, arr, dp);
            profit = Math.max(bought, notBought);
        }

        if(buy == 1) {
            int sell = arr[index] + buyStocks(index + 1, 0, n, arr, dp);
            int notSell = 0 + buyStocks(index + 1, 1, n, arr, dp);
            profit = Math.max(sell, notSell);
        }

        dp[index][buy] = profit;
        return profit;
    }
}
