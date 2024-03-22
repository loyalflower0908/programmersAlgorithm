class Solution {
    fun solution(s: String): Boolean {
        var s_l = s.length
        if(s_l == 4 || s_l == 6){
            if(s.filterNot { it in '0'..'9' }.isNotEmpty()){
                return false
            }else{
                return true
            }
        }
        return false
    }
}