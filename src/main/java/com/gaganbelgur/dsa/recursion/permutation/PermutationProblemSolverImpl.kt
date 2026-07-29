package main.java.com.gaganbelgur.dsa.recursion.permutation

class PermutationProblemSolverImpl: PermutationProblemSolverInterface {
    override fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val current = mutableListOf<Int>()
        val visited = BooleanArray(nums.size) { false }

        fun backtrack() {
            if(current.size == nums.size) {
                result.add(current.toList())
                return
            }

            for(i in nums.indices) {
                if (visited[i]) continue

                visited[i] = true
                current.add(nums[i])

                backtrack()

                visited[i] = false
                current.removeAt(current.lastIndex)
            }
        }

        backtrack()
        return result
    }
}