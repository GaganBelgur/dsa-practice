package test.java.com.gaganbelgur.dsa.recursion.reversestack

import main.java.com.gaganbelgur.dsa.recursion.reversestack.ReverseStackProblemSolverInterface
import main.java.com.gaganbelgur.dsa.recursion.reversestack.ReverseStackSolverImpl
import org.junit.Assert
import org.junit.Test
import java.util.Stack

class ReverseStackSolverTest {

    val reverseStackProblemSolver: ReverseStackProblemSolverInterface = ReverseStackSolverImpl()

    @Test
    fun testReverseStackSolver() {
        val input = Stack<Int>()
        input.push(1)
        input.push(2)
        input.push(3)
        input.push(4)

        val expected = Stack<Int>()
        expected.push(4)
        expected.push(3)
        expected.push(2)
        expected.push(1)

        reverseStackProblemSolver.reverse(input)
        Assert.assertEquals(expected, input)
    }
}