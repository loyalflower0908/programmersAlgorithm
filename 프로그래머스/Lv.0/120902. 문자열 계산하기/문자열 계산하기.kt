class Solution {
    fun solution(my_string: String) = my_string.split(' ').let{
        var result = it[0].toInt()
        for(i in 0 until it.size){
            if(i%2 == 1){
                if(it[i] == "+"){
                    result += it[i+1].toInt()
                }else{
                    result -= it[i+1].toInt()
                }
            }
        }
        result
    }
}