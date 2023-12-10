class Solution {
    fun solution(binomial: String): Int {
        val input = binomial.split(" ")
        return when(input[1]){
            "+" -> input[0].toInt() + input[2].toInt()
            "-" -> input[0].toInt() - input[2].toInt()
            "*" -> input[0].toInt() * input[2].toInt()
            else -> -1
        }
    }
}