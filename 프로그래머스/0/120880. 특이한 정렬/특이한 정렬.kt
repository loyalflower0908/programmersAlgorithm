class Solution {
    fun solution(numlist: IntArray, n: Int) = numlist.sortedDescending().sortedBy{ Math.abs(it-n) }
}
