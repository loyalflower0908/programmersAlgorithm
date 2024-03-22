class Solution {
    fun solution(s: String): String {
        var cnt = 0
        var answer = ""
        for(i in s){
            if(i==' '){
                cnt = 0
                answer += " "
            }else{
                if(cnt%2 == 0){
                    answer += i.uppercase().toString()
                }else{
                    answer += i.lowercase().toString()
                }
                cnt++
            }
        }
        return answer
    }
}