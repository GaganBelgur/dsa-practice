package main.java.com.gaganbelgur.dsa.recursion.atoi

class ATOISolverImpl: ATOIProblemSolverInterface {
    override fun myATOI(input: String): Int {
        var isPositive = true
        val n: Int = input.length
        var isSignFound = false


        // Remove space first
        // Find the operator + or -
        // Find the isDigit
        // Stop the iteration if it is a character after processing digit
        var currentPointer = 0
        for (i in 0..<n) {
            if (input[i] == ' ') {
                currentPointer++
            } else {
                break
            }
        }

        if (currentPointer == n) return 0

        if (input[currentPointer] == '+') {
            isPositive = true
            isSignFound = true
            currentPointer += 1
        } else if (input[currentPointer] == '-') {
            isPositive = false
            isSignFound = true
            currentPointer += 1
        }

        if (currentPointer == n) return 0

        if (isSignFound) {
            if (!Character.isDigit(input[currentPointer])) return 0
        } else {
            if (!Character.isDigit(input[currentPointer])) return 0
        }

        var result: Long = 0
        var isDigitStarted = false
        for (i in currentPointer..<n) {
            if (Character.isDigit(input[i])) {
                result = result * 10 + (input[i] - '0')
                isDigitStarted = true
                if (isPositive) {
                    if (result > Int.MAX_VALUE) {
                        return Int.MAX_VALUE
                    }
                } else {
                    if (result > Int.MAX_VALUE.toLong() + 1) {
                        return Int.MIN_VALUE
                    }
                }
            } else {
                if (isDigitStarted) break
            }
        }

        return if (isPositive) {
            result.toInt()
        } else {
            (result.toInt()) * -1
        }
    }
}