class Solution {
    fun solution(s: String): Int {
        var numList = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var temp = ""
        var answer = ""
        for(i in s) {
            if(i in '0'..'9'){
                answer+=i
            }else{
                temp += i
                if(temp in numList){
                    answer+=numList.indexOf(temp)
                    temp = ""
                }
            }
        }
        return answer.toInt()
    }
}