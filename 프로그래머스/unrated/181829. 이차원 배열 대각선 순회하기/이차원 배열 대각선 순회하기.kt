class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
        for((indexi, i) in board.withIndex()){
            for((indexj, j) in board[indexi].withIndex()){
                if(indexi + indexj <= k){
                    answer += j
                }
            }
        }
        return answer
    }
}