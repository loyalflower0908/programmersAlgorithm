class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 0
        for(i in dic){
            for(j in spell){
                if(j in i){
                    answer = 1
                }else{
                    answer = 2
                    break
                }
            }
            if(answer == 1){
                return answer
            }
        }
        return answer
    }
}