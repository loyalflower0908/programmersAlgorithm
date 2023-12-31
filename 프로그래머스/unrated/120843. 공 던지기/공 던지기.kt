class Solution {
    fun solution(numbers: IntArray, k: Int) = if(2*(k-1)<numbers.size) numbers[2*(k-1)] else numbers[2*(k-1)%numbers.size]
}