package main.java.com.gaganbelgur.dsa.strings.romannumerals

class RomanNumeralsSolverImpl: RomanNumeralsProblemSolverInterface {
    override fun solve(roman: String): Int {
        var total = 0

        for (i in roman.indices) {
            val currentValue: Int = getInteger(roman[i])

            if (i + 1 < roman.length) {
                val nextValue: Int = getInteger(roman[i + 1])

                if (currentValue < nextValue) {
                    total -= currentValue
                } else {
                    total += currentValue
                }
            } else {
                total += currentValue
            }
        }

        return total
    }

    companion object {
        fun getInteger(c: Char): Int {
            return when (c) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
        }
    }
}