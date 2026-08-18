package test.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring

import main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring.LongestPalindromicSubStringProblemSolverInterface
import org.junit.Assert.assertEquals
import org.junit.Test

abstract class LongestPalindromicSubStringBaseTest {

    private val longestPalindromicSubStringProblemSolverInterface: LongestPalindromicSubStringProblemSolverInterface = getPalindromicSubStringSolver()

    abstract fun getPalindromicSubStringSolver(): LongestPalindromicSubStringProblemSolverInterface

    @Test
    fun testLongestPalindrome() {
        val expected = "bab"
        val actual = longestPalindromicSubStringProblemSolverInterface.longestPalindrome("babad")
        assertEquals(expected, actual)
    }
}