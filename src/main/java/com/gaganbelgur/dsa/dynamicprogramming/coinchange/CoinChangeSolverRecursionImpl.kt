package main.java.com.gaganbelgur.dsa.dynamicprogramming.coinchange

class CoinChangeSolverRecursionImpl: CoinChangeProblemSolverInterface {
    override fun coinChange(coins: IntArray, amount: Int): Int = findAllCombos(coins.size - 1, amount, coins)

    private fun findAllCombos(index: Int, amount: Int, coins: IntArray): Int {
        if (index < 0) return 0
        if (amount == 0) return 1

        var pick = 0
        if (coins[index] <= amount) {
            pick = findAllCombos(index, amount - coins[index], coins)
        }
        val notPick = findAllCombos(index - 1, amount, coins)

        return pick + notPick
    }
}