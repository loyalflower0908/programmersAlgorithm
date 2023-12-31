class Solution {
    fun solution(numbers: IntArray, direction: String) = when (direction) {
        "right" -> intArrayOf(numbers.last()) + numbers.sliceArray(0 until numbers.size - 1)
        else -> numbers.sliceArray(1 until numbers.size) + intArrayOf(numbers.first())
    }
}