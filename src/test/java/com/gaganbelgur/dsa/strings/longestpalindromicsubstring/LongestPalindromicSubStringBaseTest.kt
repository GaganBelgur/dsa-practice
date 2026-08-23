package test.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring

import main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring.LongestPalindromicSubStringProblemSolverInterface
import org.junit.Assert.assertEquals
import org.junit.Test

abstract class LongestPalindromicSubStringBaseTest {
    abstract fun getPalindromicSubStringSolver(): LongestPalindromicSubStringProblemSolverInterface

    @Test
    fun testLongestPalindrome() {
        val expected = "bab"
        val actual = getPalindromicSubStringSolver().longestPalindrome("babad")
        assertEquals(expected, actual)
    }

    @Test
    fun testLongestPalindromeForNumber() {
        val expected = "12321"
        val actual = getPalindromicSubStringSolver().longestPalindrome("12321")
        assertEquals(expected, actual)
    }
}