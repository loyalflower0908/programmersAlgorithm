class Solution {
    fun solution(cipher: String, code: Int) = cipher.filterIndexed { index, i -> (index + 1) % code == 0 }
}