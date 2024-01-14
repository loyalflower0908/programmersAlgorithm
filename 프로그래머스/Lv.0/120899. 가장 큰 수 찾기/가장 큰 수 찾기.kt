class Solution {
    fun solution(array: IntArray) = intArrayOf(array.maxOrNull()!!, array.indexOf(array.maxOrNull()!!))
}