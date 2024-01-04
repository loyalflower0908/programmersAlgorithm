class Solution {
    fun solution(n: Int) = if(Math.pow(Math.sqrt(n.toDouble()).toInt().toDouble(), 2.0).toInt() == n) 1 else 2
}