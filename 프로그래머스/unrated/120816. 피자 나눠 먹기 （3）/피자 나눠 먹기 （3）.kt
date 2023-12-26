class Solution {
    fun solution(slice: Int, n: Int): Int {
        var pan = 1
        while(true){
            if(slice*pan/n>=1){
                return pan
            }else{
                pan++
            }
        }
    }
}