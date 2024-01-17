class Solution {
    fun solution(my_string: String): Int {
        var checkNum = ""
        var isOneNum = false
        for(i in my_string){
            if(i in ('0'..'9')){
                checkNum += i
                isOneNum = true
            }else if(isOneNum){
                checkNum += ' '
                isOneNum = false
            }
        }
        
        
        if (checkNum == "") {
            return 0
        }
        
        return checkNum.trim().split(' ').map{ it.toInt() }.sum()
    }
}