package main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.type4stockswithfee

import kotlin.math.max

class StockBuySellStockWithFeeSolverRecursionApproach {
    fun stockBuySell(arr: IntArray, n: Int, fees: Int): Int {
        return buyStocks(0, 0, n, arr, fees)
    }

    private fun buyStocks(index: Int, buy: Int, n: Int, arr: IntArray, fees: Int): Int {
        if (index == n) return 0

        var profit = 0

        if (buy == 0) {
            val bought = -arr[index] + buyStocks(index + 1, 1, n, arr, fees)
            val notBought = 0 + buyStocks(index + 1, 0, n, arr, fees)
            profit = max(bought, notBought)
        }

        if (buy == 1) {
            val sell = (arr[index] - fees) + buyStocks(index + 1, 0, n, arr, fees)
            val notSell = 0 + buyStocks(index + 1, 1, n, arr, fees)
            profit = max(sell, notSell)
        }

        return profit
    }
}