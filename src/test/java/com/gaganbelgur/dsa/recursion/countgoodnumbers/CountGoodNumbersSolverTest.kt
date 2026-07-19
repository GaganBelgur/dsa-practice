package test.java.com.gaganbelgur.dsa.recursion.countgoodnumbers

import main.java.com.gaganbelgur.dsa.recursion.countgoodnumbers.CountGoodNumbersSolverImpl
import org.junit.Test

class CountGoodNumbersSolverTest {

    private val solver = CountGoodNumbersSolverImpl()

    @Test
    fun testCountGoodNumbers() {
        val input = 1
        val expected = 5
        val actual = solver.countGoodNumbers(input.toLong())
        assert(expected == actual) { "Expected: $expected, Actual: $actual" }
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Given negative number, When Count good number is invoked, Then returns 0`() {
        val input = -1
        val actual = solver.countGoodNumbers(input.toLong())
        val expected = 0
        assert(expected == actual) { "Expected: $expected, Actual: $actual" }
    }

    @Test
    fun `Given a large number, When Count good number is invoked, Then value should be greater than 0`() {
        val input = 1000000000000000
        val actual = solver.countGoodNumbers(input)
        val expected = 711414395

        assert(expected == actual) { "Expected: $expected, Actual: $actual" }
    }
}