class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        return Array(picture.size * k) { i ->
            picture[i / k].flatMap { c ->
                Array(k) { c }.toList()
            }.joinToString("")
        }
    }
}