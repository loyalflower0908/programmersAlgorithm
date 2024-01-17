class Solution {
    fun solution(quiz: Array<String>) = quiz.map{
        it.split(' ').let{
            if(it[1] == "+"){
                if(it[0].toInt() + it[2].toInt() == it[4].toInt()){
                    "O"
                }else{
                    "X"
                }
            }else{
                if(it[0].toInt() - it[2].toInt() == it[4].toInt()){
                    "O"
                }else{
                    "X"
                }
            }
        }
    }
}