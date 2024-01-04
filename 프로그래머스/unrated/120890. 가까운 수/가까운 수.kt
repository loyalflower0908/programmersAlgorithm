import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = array[0]
        var sim:Int = abs(n-array[0])
        for(i in array){
            if(abs(n-i) < sim){
                sim = abs(n-i)
                answer = i
            }else if(abs(n-i) == sim){
                if(i < answer){
                    answer = i
                }
            }
        }
        return answer
    }
}