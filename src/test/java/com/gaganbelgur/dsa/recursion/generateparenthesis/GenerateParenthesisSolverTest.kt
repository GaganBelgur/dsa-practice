package test.java.com.gaganbelgur.dsa.recursion.generateparenthesis

import main.java.com.gaganbelgur.dsa.recursion.generateparanthesis.GenerateParenthesisSolverImpl
import org.junit.Test

class GenerateParenthesisSolverTest {

    private val generateParenthesisSolverImpl = GenerateParenthesisSolverImpl()

    @Test
    fun testGenerateParenthesis() {
        val n = 3
        val expected = listOf("((()))", "(()())", "(())()", "()(())", "()()()")
        val result = generateParenthesisSolverImpl.generateParenthesis(n)
        assert(result.containsAll(expected) && expected.containsAll(result))
    }
}