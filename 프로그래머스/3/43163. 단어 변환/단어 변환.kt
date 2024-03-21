import java.util.ArrayDeque

class Solution{
    fun solution(begin: String, target: String, words: Array<String>): Int {
        if (target !in words) return 0

        val visited = mutableSetOf<String>()
        val queue = ArrayDeque<Pair<String, Int>>()
        queue.offer(Pair(begin, 0))

        while (queue.isNotEmpty()) {
            val (word, steps) = queue.poll()
            if (word == target) return steps

            for (nextWord in words) {
                if (nextWord !in visited && isOneCharDifferent(word, nextWord)) {
                    visited.add(nextWord)
                    queue.offer(Pair(nextWord, steps + 1))
                }
            }
        }

        return 0
    }
}


fun isOneCharDifferent(word1: String, word2: String): Boolean {
    var diffCount = 0
    for (i in word1.indices) {
        if (word1[i] != word2[i]) {
            diffCount++
            if (diffCount > 1) return false
        }
    }
    return diffCount == 1
}
