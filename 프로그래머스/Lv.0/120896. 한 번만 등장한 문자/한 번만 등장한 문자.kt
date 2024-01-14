class Solution {
    fun solution(s: String) = s.filterNot{ a -> s.filter{b-> b==a}.length>1 }.toCharArray().sorted().joinToString("")
}