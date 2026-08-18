package test.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring

import main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring.LongestPalindromicSubStringBruteForceSolverImpl
import main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring.LongestPalindromicSubStringProblemSolverInterface

class LongestPalindromicBruteForceSolverTest: LongestPalindromicSubStringBaseTest() {
    override fun getPalindromicSubStringSolver(): LongestPalindromicSubStringProblemSolverInterface {
        return LongestPalindromicSubStringBruteForceSolverImpl()
    }
}