class Solution {
    fun solution(emergency: IntArray): List<Int> {
        val a = emergency.sortedDescending()
        var answer = mutableListOf<Int>()
        for(i in emergency){
            for((index, value) in a.withIndex()){
                if(i == value){
                    answer.add(index+1)
                }
            }
        }
        return answer
    }
}