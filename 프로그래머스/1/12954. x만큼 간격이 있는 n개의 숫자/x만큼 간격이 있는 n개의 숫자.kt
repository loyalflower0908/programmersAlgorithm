class Solution {
    fun solution(x: Int, n: Int): List<Long> {
        var a = mutableListOf<Long>()
        var num = 1L
        while(a.size != n){
            a.add(x*num)
            num ++
        }
        return a
    }
}