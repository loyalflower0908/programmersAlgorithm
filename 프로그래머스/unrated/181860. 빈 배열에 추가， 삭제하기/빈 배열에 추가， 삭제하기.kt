class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = mutableListOf<Int>()
        for((index, i) in flag.withIndex()){
            if(i){
                repeat(arr[index]*2){
                    answer.add(arr[index])
                }
            }else{
                repeat(arr[index]) {
                    answer.removeLast()
                }
            }
        }
        return answer.toIntArray()
    }
}