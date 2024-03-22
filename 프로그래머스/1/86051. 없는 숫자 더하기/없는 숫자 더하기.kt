class Solution {
    fun solution(numbers: IntArray) = (0..9).filter{ it !in numbers }.sum()
}