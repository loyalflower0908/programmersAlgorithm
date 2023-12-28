class Solution {
    fun solution(age: Int): String {
        var answer: String = ""
        for(i in age.toString()){
            when(i){
                '0' -> answer+="a"
                '1' -> answer+="b"
                '2' -> answer+="c"
                '3' -> answer+="d"
                '4' -> answer+="e"
                '5' -> answer+="f"
                '6' -> answer+="g"
                '7' -> answer+="h"
                '8' -> answer+="i"
                else -> answer+="j"
            }
        }
        return answer
    }
}