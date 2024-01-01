class Solution {
    fun solution(n: Int): Int {
        var count = 0
        var i = 1
        while(i<=n){
            count += countPlus(i)
            i++
        }
        return count
    }
}

fun countPlus(num:Int):Int{
    var cnt = 0
    for(i in 1..num){
        if(num % i == 0){
            cnt++
        }
    }
    if(cnt >= 3){
        return 1
    }else{
        return 0
    }
}