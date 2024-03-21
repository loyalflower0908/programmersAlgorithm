class Solution {
    fun solution(n: Int) = n.toString().sumBy { it.digitToInt() }
}