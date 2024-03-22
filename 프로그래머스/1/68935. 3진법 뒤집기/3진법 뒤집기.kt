class Solution {
    fun solution(n: Int): Int {
        var x = n
        var three = ""
        while(x != 0){
            three += (x % 3).toString()
            x = x / 3
        }
        var q = 1
        var answer = 0
        for(i in three.reversed()){
            answer += i.digitToInt() * q
            q *= 3
        }
        return answer
    }
}