class Solution {
    fun solution(arr: IntArray): IntArray {
        val b = arr.filterNot{ it == arr.minOrNull()!! }
        if(b.size == 0){
            return intArrayOf(-1)
        }else{
            return b.toIntArray()
        }
    }
}