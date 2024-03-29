class Solution {
    fun solution(arr: IntArray) = arr.sorted().let{
        var switch = true
        var n = 0
        var q = 1
        while(switch){
            n += it[0]
            for(i in it){
                if(n % i != 0){
                    switch = true
                    break
                }else{
                    switch = false
                }
            }
        }
        n
    }
}