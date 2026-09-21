package main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.type3

import main.java.com.gaganbelgur.dsa.dynamicprogramming.stocks.StocksBuySellSolverInterface
import java.util.*
import kotlin.math.max

class StockBuySellMaxTwoTradeSolverMemorizationApproach: StocksBuySellSolverInterface {
    override fun stockBuySell(arr: IntArray, n: Int): Int {
        if (n == 0) return 0

        val dp = Array<Array<IntArray>>(n) { Array(2) { IntArray(3) } }

        for (i in 0..<n) {
            for (j in 0..1) {
                Arrays.fill(dp[i][j] , -1)
            }
        }

        val profit = buyStocks(0, 0, n, arr, dp, 2)

        return profit
    }

    private fun buyStocks(index: Int, buy: Int, n: Int, arr: IntArray, dp: Array<Array<IntArray>>, count: Int): Int {
        if (count == 0) return 0
        if (index == n) return 0

        if (dp[index][buy][count] != -1) return dp[index][buy][count]
        var profit = 0

        if (buy == 0) {
            val bought = (-1 * arr[index]) + buyStocks(index + 1, 1, n, arr, dp, count)
            val notBought = 0 + buyStocks(index + 1, 0, n, arr, dp, count)
            profit = max(bought, notBought)
        }

        if (buy == 1) {
            val sell = arr[index] + buyStocks(index + 1, 0, n, arr, dp, count - 1)
            val notSell = 0 + buyStocks(index + 1, 1, n, arr, dp, count)
            profit = max(sell, notSell)
        }

        dp[index][buy][count] = profit
        return profit
    }
}