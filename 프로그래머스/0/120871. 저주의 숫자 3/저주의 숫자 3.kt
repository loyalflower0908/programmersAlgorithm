class Solution {
    fun solution(n: Int): Int {
        var count = 0
        for(i in 1..n){
            count++
            while(count%3==0 || count.toString().contains('3')){
                count++
            }
        }
        return count
    }
}