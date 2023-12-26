class Solution {
    fun solution(n: Int): Int {
        var i = 1
        while(true){
            if(6*i%n==0){
                return i
            }else{
                i++
            }
        }
    }
}