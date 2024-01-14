class Solution {
    fun solution(num: Int, k: Int) = num.toString().toCharArray().let{
        if(it.contains(k.digitToChar())){
            it.indexOf(k.digitToChar()) + 1
        }else{
            -1
        }
    }
}