class Solution {
    fun solution(rsp: String) = rsp.map{
        when(it){
            '2' -> '0'
            '0' -> '5'
            else -> '2'
        }
    }.joinToString("")
}