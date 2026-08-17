package test.java.com.gaganbelgur.dsa.strings.removeouterparenthesis

import main.java.com.gaganbelgur.dsa.strings.outerparenthesis.RemoveOuterParenthesisProblemSolverInterface
import main.java.com.gaganbelgur.dsa.strings.outerparenthesis.RemoveOuterParenthesisSolverImpl
import org.junit.Assert.assertEquals
import org.junit.Test

class RemoveOuterParenthesisSolverTest {

    private val removeOuterParenthesisProblemSolverInterface: RemoveOuterParenthesisProblemSolverInterface =
        RemoveOuterParenthesisSolverImpl()

    @Test
    fun testRemoveOuterParenthesis() {
        val expected = "(())"
        val actual = removeOuterParenthesisProblemSolverInterface.removeOuterParentheses("((()))")
        assertEquals(expected, actual)
    }
}