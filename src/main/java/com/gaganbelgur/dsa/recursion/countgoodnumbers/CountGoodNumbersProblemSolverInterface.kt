package main.java.com.gaganbelgur.dsa.recursion.countgoodnumbers

fun interface CountGoodNumbersProblemSolverInterface {
    companion object {
        internal const val MODULO: Long = 1000000007
    }

    fun countGoodNumbers(input: Long): Int
}