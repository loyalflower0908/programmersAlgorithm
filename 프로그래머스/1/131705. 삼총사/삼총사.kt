class Solution {
    fun solution(number: IntArray): Int {
        var count = 0
        val n = number.size
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                for (k in j + 1 until n) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count++
                    }
                }
            }
        }
        return count
    }
}