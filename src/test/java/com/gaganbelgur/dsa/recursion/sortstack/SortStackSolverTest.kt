package test.java.com.gaganbelgur.dsa.recursion.sortstack

import main.java.com.gaganbelgur.dsa.recursion.sortstack.SortStackSolverImpl
import org.junit.Assert
import org.junit.Test
import java.util.*

class SortStackSolverTest {

    private val sortStackProblemSolverInterface = SortStackSolverImpl()

    @Test
    fun `Given unsorted stack, When sort is invoked, Then stack should have sorted elements`() {
        val inputStack = Stack<Int>()
        inputStack.push(3)
        inputStack.push(2)
        inputStack.push(4)
        inputStack.push(1)

        val expectedStack = Stack<Int>().apply {
            addAll(inputStack.toSortedSet())
        }
        sortStackProblemSolverInterface.sort(stack = inputStack)

        Assert.assertEquals(expectedStack, inputStack)
    }
}