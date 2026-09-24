package main.java.com.gaganbelgur.dsa.dynamicprogramming.coinchange

fun interface CoinChangeProblemSolverInterface {
    fun coinChange(coins: IntArray, amount: Int): Int
}