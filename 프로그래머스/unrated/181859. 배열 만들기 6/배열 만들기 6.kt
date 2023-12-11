class Solution {
    fun solution(arr: IntArray): List<Int> {
        var i = 0
        var stk = mutableListOf<Int>()
        while(i < arr.size){
            if(stk.isEmpty()){
                stk.add(arr[i])
                i++
            }else if(stk.last() == arr[i]){
                stk.removeLast()
                i++
            }else{
                stk.add(arr[i])
                i++
            }
        }
        if(stk.isEmpty()){
            return listOf(-1)
        }else{
            return stk
        }
    }
}