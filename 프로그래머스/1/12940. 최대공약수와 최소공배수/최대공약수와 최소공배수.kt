class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(min(n,m), max(n,m))
    }
}

fun min(n:Int, m:Int):Int{
    var result = 0
    if(n > m){
        for(i in 1..m){
            if(n%i == 0 && m%i == 0){
                result = i
            }
        }
    }else{
        for(i in 1..n){
            if(n%i == 0 && m%i == 0){
                result = i
            }
        }
    }
    return result
}

fun max(n:Int, m:Int):Int{
    var result = 0
    var x = 0
    if(n > m){
        x = n
        while(true){
            if(x%n == 0 && x%m == 0){
                return x
            }
            x++
        }
    }else{
        x = m
        while(true){
            if(x%n == 0 && x%m == 0){
                return x
            }
            x++
        }
    }
}