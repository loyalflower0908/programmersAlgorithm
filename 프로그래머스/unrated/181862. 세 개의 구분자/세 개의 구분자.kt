class Solution {
    fun solution(myStr: String):List<String>{
        val result = myStr.split("[a|b|c]".toRegex()).filter{it.isNotEmpty()}
        if(result.isNotEmpty()){
            return result
        }else{
            return listOf("EMPTY")
        }
    }
}