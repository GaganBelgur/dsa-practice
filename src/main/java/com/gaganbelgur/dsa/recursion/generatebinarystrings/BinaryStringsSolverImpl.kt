package main.java.com.gaganbelgur.dsa.recursion.generatebinarystrings

class BinaryStringsSolverImpl: BinaryStringsGeneratorProblemSolverInterface {
    override fun generateBinaryStrings(n: Int): List<String> {
        val result = mutableListOf<String>()
        backtrack("", n, '0', result)
        return result
    }

    private fun backtrack(str: String, n: Int, prev: Char, result: MutableList<String>) {
        if(str.length == n) {
            result.add(str)
            return
        }

        backtrack(str + "0", n, '0', result)
        if(prev != '1') {
            backtrack(str + "1", n, '1', result)
        }
    }
}