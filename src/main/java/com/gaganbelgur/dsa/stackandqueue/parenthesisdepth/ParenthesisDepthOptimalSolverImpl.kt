package main.java.com.gaganbelgur.dsa.stackandqueue.parenthesisdepth

class ParenthesisDepthOptimalSolverImpl : ParenthesisDepthProblemSolverInterface {

    override fun maxDepth(inputString: String): Int {
        var currentDepth = 0
        var maxDepth = 0

        for (i in inputString.indices) {
            val char = inputString[i]
            if (char == '(') {
                currentDepth++
            } else if (char == ')') {
                currentDepth--
            }
            maxDepth = maxOf(maxDepth, currentDepth)
        }

        return maxDepth
    }
}