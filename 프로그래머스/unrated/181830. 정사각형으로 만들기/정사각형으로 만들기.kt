class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val maxDimension = maxOf(arr.size, arr[0].size)
        return Array(maxDimension) { i ->
            if (i < arr.size) {
                arr[i] + IntArray(maxDimension - arr[i].size) { 0 }
            } else {
                IntArray(maxDimension) { 0 }
            }
        }
    }
}