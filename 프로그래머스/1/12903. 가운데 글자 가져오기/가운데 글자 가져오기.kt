class Solution {
    fun solution(s: String) = if(s.length % 2 == 0) s[s.length/2 - 1].toString() + s[s.length/2].toString() else s[s.length/2].toString()
}