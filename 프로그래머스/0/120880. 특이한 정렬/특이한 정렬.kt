class Solution {
    fun solution(numlist: IntArray, n: Int) = numlist.sortedWith(compareBy({ Math.abs(it - n) }, { -it }))
}
