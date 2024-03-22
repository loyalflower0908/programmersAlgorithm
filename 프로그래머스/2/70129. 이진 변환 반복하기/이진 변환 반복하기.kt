class Solution {
    fun solution(s: String): IntArray {
        var zero = 0
        var s = s
        var cnt = 0
        while(true){
            if(s != "1"){
                zero += s.filter{it=='0'}.count()
                s = Integer.toBinaryString(s.filter{it != '0'}.count())
                cnt++
            }else{
                break
            }
        }
        return intArrayOf(cnt, zero)
    }
}