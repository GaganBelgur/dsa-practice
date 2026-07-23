package main.java.com.gaganbelgur.dsa.recursion.sortstack

import java.util.Stack

class SortStackSolverImpl: SortStackProblemSolverInterface {
    override fun sort(stack: Stack<Int>) {
        if (stack.isEmpty()) {
            return
        }

        val top = stack.pop()
        sort(stack)
        insertInSortedOrder(stack, top)
    }

    private fun insertInSortedOrder(stack: Stack<Int>, element: Int) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element)
            return
        }

        val top = stack.pop()
        insertInSortedOrder(stack, element)
        stack.push(top)
    }
}