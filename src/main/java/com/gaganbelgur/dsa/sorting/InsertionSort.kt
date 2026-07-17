package main.java.com.gaganbelgur.dsa.sorting

class InsertionSort: SortInterface {
    override fun sort(inputArray: IntArray?) {
        if (inputArray == null) {
            throw IllegalArgumentException("Input array cannot be null")
        }

        val n = inputArray.size
        for (i in 1 until n) {
            var j = i
            while (j > 0 && inputArray[j-1] > inputArray[j]) {
                val temp = inputArray[j-1]
                inputArray[j-1] = inputArray[j]
                inputArray[j] = temp
                j--
            }
        }
    }
}