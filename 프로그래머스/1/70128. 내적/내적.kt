class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        var x = a.size
        for(i in 0 until x){
            answer += a[i]*b[i]
        }
        return answer
    }
}