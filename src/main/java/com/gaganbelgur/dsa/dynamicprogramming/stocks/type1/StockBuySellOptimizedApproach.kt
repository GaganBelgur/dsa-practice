package main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.type1

import main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.StocksBuySellSolverInterface

class StockBuySellOptimizedApproach: StocksBuySellSolverInterface {
    override fun stockBuySell(arr: IntArray?, n: Int): Int {
        var maxProfit = 0
        for (i in 1 until n) {
            if (arr!![i] > arr[i - 1]) {
                maxProfit += arr[i] - arr[i - 1]
            }
        }
        return maxProfit
    }
}