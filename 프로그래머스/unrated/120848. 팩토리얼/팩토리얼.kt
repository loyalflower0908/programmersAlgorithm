class Solution {
    fun solution(n: Int): Int {
        var i = 1
        while(true){
            if(factorial(i)>n){
                break
            }
            i++
        }
        return i-1
    }
}

fun factorial(num:Int):Int{
    return if(num==0) 1 else num*factorial(num-1)
}