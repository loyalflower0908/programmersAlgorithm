class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var reserveList = reserve.filterNot{ it in lost }.sorted().toIntArray()
        var lostList = lost.filterNot { it in reserve }
        var answer = n - lostList.size
        for(i in lostList.sorted()){
            for((index, j) in reserveList.withIndex()){
                if(j-1 == i || j+1 == i){
                    answer++
                    reserveList[index] = -1
                    break
                }
            }
        }
        return answer
    }
}