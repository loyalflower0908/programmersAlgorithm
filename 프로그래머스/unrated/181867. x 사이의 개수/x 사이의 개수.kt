class Solution {
    fun solution(myString: String): List<Int> {
        var answer = mutableListOf<Int>()
        for(i in myString.split('x')){
            answer.add(i.length)
        }
        return answer
    }
}