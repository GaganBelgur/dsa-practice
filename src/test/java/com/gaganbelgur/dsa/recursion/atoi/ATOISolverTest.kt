package test.java.com.gaganbelgur.dsa.recursion.atoi

import main.java.com.gaganbelgur.dsa.recursion.atoi.ATOIProblemSolverInterface
import main.java.com.gaganbelgur.dsa.recursion.atoi.ATOISolverImpl
import org.junit.Assert.assertEquals
import org.junit.Test

@Suppress("FunctionName")
class ATOISolverTest {

    val atoiSolver: ATOIProblemSolverInterface = ATOISolverImpl()

    @Test
    fun `Given valid string input When converting to integer Then should return correct integer`() {
        val input = "123"
        val expectedResult = 123
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given string with leading whitespaces When converting to integer Then should ignore whitespaces`() {
        val input = "  123"
        val expectedResult = 123
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given string with negative sign When converting to integer Then should return negative integer`() {
        val input = "-123"
        val expectedResult = -123
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given string containing trailing characters When converting to integer Then should stop parsing at first non digit`() {
        val input = "123abc"
        val expectedResult = 123
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given string exceeding integer maximum value When converting to integer Then should return Integer MAX_VALUE`() {
        val input = "2147483647"
        val expectedResult = Int.MAX_VALUE
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given invalid string input When converting to integer Then should return zero`() {
        val input = "abc123"
        val expectedResult = 0
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given string exceeding integer minimum value When converting to integer Then should return Integer MIN_VALUE`() {
        val input = "-2147483648"
        val expectedResult = Int.MIN_VALUE
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given string containing only sign When converting to integer Then should return zero`() {
        val input = "+"
        val expectedResult = 0
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given empty string When converting to integer Then should return zero`() {
        val input = ""
        val expectedResult = 0
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `Given string containing only whitespaces When converting to integer Then should return zero`() {
        val input = "   "
        val expectedResult = 0
        val result = atoiSolver.myATOI(input)

        assertEquals(expectedResult, result)
    }
}