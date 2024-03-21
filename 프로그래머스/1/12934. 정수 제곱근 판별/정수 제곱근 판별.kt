import kotlin.math.sqrt

class Solution {
    fun solution(n: Long) = sqrt(n.toDouble()).let {
        val root = it.toLong()
        if (root * root == n) (root + 1) * (root + 1) else -1
    }
}