package main.java.com.gaganbelgur.dsa.dynamicprogramming.coinchange

import java.util.*


class CoinChangeSolverMemoizationImpl: CoinChangeProblemSolverInterface {
    override fun coinChange(coins: IntArray, amount: Int): Int {
        val dp: Array<LongArray> = Array(coins.size+1) { LongArray(amount + 1) }
        for (arr in dp) {
            Arrays.fill(arr, -1)
        }
        return findAllCombos(coins.size - 1, amount, coins, dp)
    }

    private fun findAllCombos(index: Int, amount: Int, coins: IntArray, dp: Array<LongArray>): Int {
        if (index < 0) return 0
        if (amount == 0) return 1

        if (dp[index][amount] != -1L) {
            return dp[index][amount].toInt()
        }

        var pick = 0
        if (coins[index] <= amount) {
            pick = findAllCombos(index, amount - coins[index], coins, dp)
        }
        val notPick = findAllCombos(index - 1, amount, coins, dp)

        dp[index][amount] = ((pick + notPick)%mod).toLong()
        return dp[index][amount].toInt()
    }
}