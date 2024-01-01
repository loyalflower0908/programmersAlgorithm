class Solution {
    fun solution(n: Int): Int {
        var i = 1
        while(true){
            if(factorial(i)>n){
                return i-1
            }
            i++
        }
    }
}

fun factorial(num:Int):Int{
    return if(num==0) 1 else num*factorial(num-1)
}