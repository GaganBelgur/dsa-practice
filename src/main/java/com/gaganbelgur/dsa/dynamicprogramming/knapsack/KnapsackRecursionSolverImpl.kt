package main.java.com.gaganbelgur.dsa.dynamicprogramming.knapsack

import kotlin.math.max

class KnapsackRecursionSolverImpl: KnapsackProblemSolverInterface {
    override fun knapsack(
        weight: IntArray,
        value: IntArray,
        n: Int,
        maxWeight: Int
    ): Int {
        return findMaxValue(n - 1, maxWeight, weight, value)
    }

    private fun findMaxValue(index: Int, W: Int, wt: IntArray, value: IntArray): Int {
        if (W == 0) return 0
        if (index < 0) return 0

        var pick = 0
        if (wt[index] <= W) {
            pick = value[index] + findMaxValue(index - 1, W - wt[index], wt, value)
        }

        val notPick = findMaxValue(index - 1, W, wt, value)

        return max(pick, notPick)
    }
}