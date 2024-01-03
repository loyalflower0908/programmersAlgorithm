class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var a = s.split(" ")
        for((index, i) in a.withIndex()){
            if(i == "Z"){
                answer -= a[index-1].toInt()
            }else{
                answer += i.toInt()
            }
        }
        return answer
    }
}