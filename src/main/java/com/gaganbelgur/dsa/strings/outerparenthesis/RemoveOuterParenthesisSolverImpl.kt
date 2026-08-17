package main.java.com.gaganbelgur.dsa.strings.outerparenthesis

class RemoveOuterParenthesisSolverImpl: RemoveOuterParenthesisProblemSolverInterface {

    override fun removeOuterParentheses(input: String): String {
        val result: StringBuilder = StringBuilder()
        var count = 0

        for (c in input.toCharArray()) {
            if (c == '(') {
                if(count > 0) {
                    result.append('(')
                }
                count++
            } else {
                count--

                if(count > 0) {
                    result.append(')')
                }
            }
        }

        return result.toString()
    }
}