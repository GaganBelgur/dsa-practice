package main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring

class LongestPalindromicSubStringBruteForceSolverImpl: LongestPalindromicSubStringProblemSolverInterface {

    override fun longestPalindrome(input: String): String {
        if (input.isEmpty()) return ""
        var longest = input.substring(0, 1)

        for (i in input.indices) {
            for (j in i + 1..input.length) {
                val substring = input.substring(i, j)
                if (substring.length > longest.length && isPalindrome(substring)) {
                    longest = substring
                }
            }
        }

        return longest
    }

    private fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (s[left] != s[right]) {
                return false
            }
            left++
            right--
        }

        return true
    }
}