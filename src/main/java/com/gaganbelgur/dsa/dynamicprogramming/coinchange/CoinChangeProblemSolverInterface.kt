package main.java.com.gaganbelgur.dsa.dynamicprogramming.coinchange

fun interface CoinChangeProblemSolverInterface {

    val mod: Int
        get() = 1e9.toInt() + 7

    fun coinChange(coins: IntArray, amount: Int): Int
}