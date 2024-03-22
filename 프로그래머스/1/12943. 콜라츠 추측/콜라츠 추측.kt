class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n = num.toLong()
        while(n!=1L){
            if(n%2 == 0L){
                n /= 2L
            }else{
                n = n * 3L + 1L
            }
            answer++
            if(answer >= 500){
                return -1
            }
        }
        return answer
    }
}