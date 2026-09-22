package main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.type1singlestock

import main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.StocksBuySellSolverInterface

class StockBuySellBruteForceApproach: StocksBuySellSolverInterface {
    override fun stockBuySell(arr: IntArray?, n: Int): Int {
        var maxProfit = 0
        for (i in arr!!.indices) {
            for (j in i + 1 until arr.size) {
                val profit = arr[j] - arr[i]
                if (profit > maxProfit) {
                    maxProfit = profit
                }
            }
        }
        return maxProfit
    }
}