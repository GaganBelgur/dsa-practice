package test.java.com.gaganbelgur.dsa.recursion.generatebinarystrings

import main.java.com.gaganbelgur.dsa.recursion.generatebinarystrings.BinaryStringsGeneratorProblemSolverInterface
import main.java.com.gaganbelgur.dsa.recursion.generatebinarystrings.BinaryStringsSolverImpl
import org.junit.Assert.assertEquals
import org.junit.Test

@Suppress("FunctionName")
class BinaryStringGeneratorSolverTest {

    val binaryStringsSolverImpl: BinaryStringsGeneratorProblemSolverInterface = BinaryStringsSolverImpl()

    @Test
    fun `Given positive integer When generate binary strings Then returned list should be of positive size`() {
       val input = 3
       val expectedList = listOf("000", "001", "010", "100", "101")
       val result = binaryStringsSolverImpl.generateBinaryStrings(input)
       assertEquals(expectedList, result)
    }
}