class Solution {
    fun solution(myString: String) = myString.split('x').filter{it.isNotEmpty()}.sorted()
}