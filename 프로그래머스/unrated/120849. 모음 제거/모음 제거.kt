class Solution {
    fun solution(my_string: String) = my_string.filterNot{ it in listOf('a', 'e', 'i', 'o', 'u')}
}