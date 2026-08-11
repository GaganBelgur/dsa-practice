package main.java.com.gaganbelgur.dsa.stackandqueue.parenthesisdepth

import java.util.Stack

class ParenthesisDepthBruteForceSolverImpl: ParenthesisDepthProblemSolverInterface {

    override fun maxDepth(inputString: String): Int {
        var currentDepth = 0
        var maxDepth = 0
        val stack: Stack<Char> = Stack<Char>()

        for(i in inputString.indices) {
            val char = inputString[i]
            if(char == '(') {
                stack.push(char)
                currentDepth++
            } else if(char == ')') {
                if(stack.isNotEmpty()) {
                    stack.pop()
                    currentDepth--
                }
            }
            maxDepth = maxOf(maxDepth, currentDepth)
        }

        return maxDepth
    }
}