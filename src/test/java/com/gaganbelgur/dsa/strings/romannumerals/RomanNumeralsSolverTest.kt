package test.java.com.gaganbelgur.dsa.strings.romannumerals

import main.java.com.gaganbelgur.dsa.strings.romannumerals.RomanNumeralsSolverImpl
import org.junit.Assert.assertEquals
import org.junit.Test

class RomanNumeralsSolverTest {

    val romanNumeralsProblemSolverInterface = RomanNumeralsSolverImpl()

    @Test
    fun testRomanNumeralsSolver() {
        val testCases = listOf(
            "III" to 3,
            "IV" to 4,
            "IX" to 9,
            "LVIII" to 58,
            "MCMXCIV" to 1994
        )

        for ((roman, expected) in testCases) {
            val result = romanNumeralsProblemSolverInterface.solve(roman)
            assertEquals(expected, result)
        }
    }
}