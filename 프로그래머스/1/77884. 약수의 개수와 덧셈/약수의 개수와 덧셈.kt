class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer = 0
        for(i in left..right){
            if(yaksu(i)%2==0){
                answer += i
            }else{
                answer -= i
            }
        }
        return answer
    }
}

fun yaksu(n:Int):Int{
    var cnt = 0
    for(i in 1..n){
        if(n%i == 0){
            cnt++
        }
    }
    return cnt
}