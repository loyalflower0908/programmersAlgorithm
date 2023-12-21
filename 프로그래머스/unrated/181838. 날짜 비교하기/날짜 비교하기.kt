class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer = 0
        for(index in date1.indices){
            if(date1[index] < date2[index]){
                answer= 1
            }else if(date1[index] > date2[index]){
                break
            }
        }
        return answer
    }
}