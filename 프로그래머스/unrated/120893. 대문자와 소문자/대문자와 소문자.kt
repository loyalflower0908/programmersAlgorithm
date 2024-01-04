class Solution {
    fun solution(my_string: String) = my_string.map{ if(it in 'a'..'z') it.uppercase() else it.lowercase()}.joinToString("")
}