class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val x= arr1.size
        val y= arr1[0].size
        var answer = Array(x){IntArray(y){0}}
        for(i in 0 until x){
            for(j in 0 until y){
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        return answer
    }
}