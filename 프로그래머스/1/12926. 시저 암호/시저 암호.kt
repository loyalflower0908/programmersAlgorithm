class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        for(i in s){
            val q = i.toInt()
            if(i in 'a'..'z'){
                if(q + n > 'z'.toInt()){
                    answer += (q+n-1-'z'.toInt()+'a'.toInt()).toChar()
                }else{
                    answer += (q+n).toChar()
                }
            }else if(i in 'A'..'Z'){
                if(q + n > 'Z'.toInt()){
                    answer += (q+n-1-'Z'.toInt()+'A'.toInt()).toChar()
                }else{
                    answer += (q+n).toChar()
                }
            }else{
                answer += i
            }
        }
        return answer
    }
}