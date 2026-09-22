package main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.type3max2stocks

import main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.StocksBuySellSolverInterface
import kotlin.math.max

class StockBuySellMaxTwoTradeSolverRecursionApproach: StocksBuySellSolverInterface {
    override fun stockBuySell(arr: IntArray?, n: Int): Int {
        return buyStocks(0, 0, n, arr!!, 2)
    }

    private fun buyStocks(index: Int, buy: Int, n: Int, arr: IntArray, count: Int): Int {
        if (count == 0) return 0
        if (index == n) return 0

        var profit = 0

        if (buy == 0) {
            val bought = (-1 * arr[index]) + buyStocks(index + 1, 1, n, arr, count)
            val notBought = 0 + buyStocks(index + 1, 0, n, arr, count)
            profit = max(bought, notBought)
        }

        if (buy == 1) {
            val sell = arr[index] + buyStocks(index + 1, 0, n, arr, count - 1)
            val notSell = 0 + buyStocks(index + 1, 1, n, arr, count)
            profit = max(sell, notSell)
        }

        return profit
    }
}