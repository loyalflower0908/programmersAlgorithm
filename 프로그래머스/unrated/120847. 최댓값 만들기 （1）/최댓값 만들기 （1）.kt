class Solution {
    fun solution(numbers: IntArray): Int {
        var a = numbers.sortedDescending()
        return a[0]*a[1]
    }
}