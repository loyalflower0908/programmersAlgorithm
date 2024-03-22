class Solution {
    fun solution(s: String): String {
        var isFirst = true
        var answer = ""
        for(c in s){
            if(c == ' '){
                answer += " "
                isFirst = true
            }else{
                if(isFirst){
                    answer += c.uppercase().toString()
                    isFirst = false
                }else{
                    answer += c.lowercase().toString()
                }
            }
        }
        return answer
    }
}
