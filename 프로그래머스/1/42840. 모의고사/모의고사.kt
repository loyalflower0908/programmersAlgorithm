class Solution {
    fun solution(answers: IntArray): IntArray {
        val cnt = IntArray(3)
        val peo1 = listOf(1, 2, 3, 4, 5)
        val peo2 = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val peo3 = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        for ((index, i) in answers.withIndex()) {
            if (i == peo1[index % 5]) {
                cnt[0]++
            }
            if (i == peo2[index % 8]) {
                cnt[1]++
            }
            if (i == peo3[index % 10]) {
                cnt[2]++
            }
        }
        val maxScore = cnt.maxOrNull()!!
        val winners = mutableListOf<Int>()
        for ((index, score) in cnt.withIndex()) {
            if (score == maxScore) {
                winners.add(index + 1)
            }
        }
        return winners.toIntArray()
    }
}