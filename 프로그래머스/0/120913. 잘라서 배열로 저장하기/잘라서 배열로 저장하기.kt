class Solution {
    fun solution(my_str: String, n: Int) = my_str.let{
        var result = mutableListOf<String>()
        for(i in 0 until my_str.length step n){
            val endIndex = minOf(i + n, my_str.length)
            result.add(my_str.substring(i, endIndex))
        }
        result
    }
}