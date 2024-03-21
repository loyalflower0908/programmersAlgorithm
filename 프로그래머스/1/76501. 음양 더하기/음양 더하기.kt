class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray) = absolutes.indices.sumBy { if (signs[it]) absolutes[it] else -absolutes[it] }
}