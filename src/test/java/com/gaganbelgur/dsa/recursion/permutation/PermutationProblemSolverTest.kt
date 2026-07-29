package test.java.com.gaganbelgur.dsa.recursion.permutation

import main.java.com.gaganbelgur.dsa.recursion.permutation.PermutationProblemSolverImpl
import org.junit.Assert.assertEquals
import org.junit.Test

@Suppress("FunctionName")
class PermutationProblemSolverTest {
    private val permutationProblemSolverInterface = PermutationProblemSolverImpl()

    @Test
    fun `Given a valid array of numbers, When permutation is invoked, Then result should be positive`() {
        val input = intArrayOf(2,4,6)
        val expectedOutput = listOf(
            listOf(2, 4, 6),
            listOf(2, 6, 4),
            listOf(4, 2, 6),
            listOf(4, 6, 2),
            listOf(6, 2, 4),
            listOf(6, 4, 2)
        )

        val actualOutput = permutationProblemSolverInterface.permute(input)

        assertEquals(expectedOutput.toSet(), actualOutput.toSet())
    }
}