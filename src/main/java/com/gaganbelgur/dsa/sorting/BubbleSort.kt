package main.java.com.gaganbelgur.dsa.sorting

class BubbleSort: SortInterface {
    override fun sort(inputArray: IntArray?) {
        if (inputArray == null) {
            throw IllegalArgumentException("Input array cannot be null")
        }

        val n = inputArray.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (inputArray[j] > inputArray[j + 1]) {
                    val temp = inputArray[j]
                    inputArray[j] = inputArray[j + 1]
                    inputArray[j + 1] = temp
                }
            }
        }
    }
}