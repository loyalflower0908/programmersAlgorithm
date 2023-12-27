class Solution {
    fun solution(num_list: IntArray): IntArray {
        val (jjak, hol) = num_list.partition { it % 2 == 0 }
        return intArrayOf(jjak.size, hol.size)
    }
}