package main.java.com.gaganbelgur.dsa.dynamicprogramming.knapsack

interface KnapsackProblemSolverInterface {
    fun knapsack(weight: IntArray, value: IntArray, n: Int, maxWeight: Int): Int
}