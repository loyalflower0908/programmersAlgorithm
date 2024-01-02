class Solution {
    fun solution(my_string: String) = my_string.filter{it in '1'..'9'}.map{it-'0'}.sum()
}