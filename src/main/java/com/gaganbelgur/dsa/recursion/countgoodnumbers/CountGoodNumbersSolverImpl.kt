package main.java.com.gaganbelgur.dsa.recursion.countgoodnumbers

import main.java.com.gaganbelgur.dsa.recursion.countgoodnumbers.CountGoodNumbersProblemSolverInterface.Companion.MODULO

class CountGoodNumbersSolverImpl: CountGoodNumbersProblemSolverInterface {
    override fun countGoodNumbers(input: Long): Int {
        if (input < 0) {
            throw IllegalArgumentException("Input cannot be negative")
        }
        val evenPositions: Long = (input + 1) / 2
        val oddPositions: Long = input / 2

        var result = moduloPower(5, evenPositions) * moduloPower(4, oddPositions)
        result %= MODULO
        return result.toInt()
    }

    private fun moduloPower(base: Long, exponent: Long): Long {
        var base = base
        var exponent = exponent
        var result: Long = 1
        base %= MODULO

        while (exponent > 0) {
            if (exponent % 2 == 1L) {
                result = (result * base) % MODULO
            }

            base = (base * base) % MODULO

            exponent /= 2
        }

        return result
    }
}