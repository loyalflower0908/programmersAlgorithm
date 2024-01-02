class Solution {
    fun solution(n: Int): List<Int> {
        var num = n
        var i = 2
        var answer = mutableListOf<Int>()
        while (num > 1) {
            while (num % i == 0) {
                answer.add(i)
                num /= i
            }
            i++
        }
        return answer.distinct()
    }
}