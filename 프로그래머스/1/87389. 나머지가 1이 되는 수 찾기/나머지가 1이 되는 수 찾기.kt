class Solution {
    fun solution(n: Int) = (1..n).find { n % it == 1 } ?: -1
}