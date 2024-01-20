class Solution {
    fun solution(A: String, B: String): Int {
        var Q = A
        if(A == B){
            return 0
        }
        for(i in 1..A.length-1){
            Q = Q.last() + Q.substring(0, A.length-1)
            if(Q == B){
                return i
            }
        }
        return -1
    }
}