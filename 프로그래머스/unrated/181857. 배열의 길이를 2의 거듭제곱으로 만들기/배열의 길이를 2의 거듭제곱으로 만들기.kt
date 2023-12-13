class Solution {
fun solution(arr: IntArray) = arr.toMutableList().apply { repeat(Integer.highestOneBit(size - 1).shl(1) - size) { add(0) } }
}