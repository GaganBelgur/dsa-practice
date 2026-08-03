package main.java.com.gaganbelgur.dsa.recursion.generateparanthesis

class GenerateParenthesisSolverImpl: GenerateParenthesisProblemSolverInterface {
    override fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()

        fun generate(index: Int, open: Int, close: Int, n: Int, s: String, result: MutableList<String>) {
            if (s.length == 2 * n) {
                result.add(s)
                return
            }

            if (open < n) {
                generate(index + 1, open + 1, close, n, "$s(", result)
            }
            if (open > close) {
                generate(index + 1, open, close + 1, n, "$s)", result)
            }
        }

        generate(0, 0, 0, n, "", result)
        return result
    }
}