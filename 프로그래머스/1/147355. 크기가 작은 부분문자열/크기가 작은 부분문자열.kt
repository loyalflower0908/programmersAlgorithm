class Solution {
    fun solution(t: String, p: String): Int {
        val key = p.length
        var cnt = 0
        for(i in 0..(t.length - key)){
            if(t.substring(i, i+key).toLong() <= p.toLong()){
                cnt++
            }
        }
        return cnt
    }
}