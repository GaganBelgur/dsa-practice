package main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring

class LongestPalindromicSubStringOptimalSolverImpl: LongestPalindromicSubStringProblemSolverInterface {

    override fun longestPalindrome(input: String): String {
        if (input.isEmpty()) return ""
        var start = 0
        var maxLength = 0

        val n= input.length

        for (i in 0 until n) {
            val len1 = expandAroundCenter(input, i, i)
            val len2 = expandAroundCenter(input, i, i + 1)
            val len = maxOf(len1, len2)

            if (len > maxLength) {
                maxLength = len
                start = i - (len - 1) / 2
            }
        }

        return input.substring(start, start + maxLength)
    }

    private fun expandAroundCenter(input: String, left: Int, right: Int): Int {
        var l = left
        var r = right

        while (l >= 0 && r < input.length && input[l] == input[r]) {
            l--
            r++
        }

        return r - l - 1
    }
}