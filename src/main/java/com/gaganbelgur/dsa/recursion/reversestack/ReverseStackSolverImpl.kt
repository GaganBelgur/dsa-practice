package main.java.com.gaganbelgur.dsa.recursion.reversestack

import java.util.Stack

class ReverseStackSolverImpl: ReverseStackProblemSolverInterface {
    override fun reverse(stack: Stack<Int>) {
        reverseStack(stack)
    }

    private fun insertAtBottom(stack: Stack<Int>, element: Int) {
        if(stack.isEmpty()) {
            stack.push(element)
            return
        }
        val top = stack.pop()
        insertAtBottom(stack, element)
        stack.push(top)
    }

    private fun reverseStack(stack: Stack<Int>) {
        if(stack.isEmpty()) return

        val top = stack.pop()
        reverseStack(stack)
        insertAtBottom(stack, top)
    }
}