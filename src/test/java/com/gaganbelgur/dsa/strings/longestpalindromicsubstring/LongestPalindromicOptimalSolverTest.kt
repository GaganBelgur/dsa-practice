package test.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring

import main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring.LongestPalindromicSubStringOptimalSolverImpl
import main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring.LongestPalindromicSubStringProblemSolverInterface

class LongestPalindromicOptimalSolverTest: LongestPalindromicSubStringBaseTest() {
    override fun getPalindromicSubStringSolver(): LongestPalindromicSubStringProblemSolverInterface {
        return LongestPalindromicSubStringOptimalSolverImpl()
    }
}