class Solution {
    fun solution(board: Array<IntArray>): Int {
        var x = listOf(-1, 0, 1)
        var y = listOf(-1, 0, 1)
        var answer = Array(board.size) { i -> board[i].copyOf() }
        var size = board.size
        for(i in 0 until size){
            for(j in 0 until size){
                if(board[i][j] == 1){
                    for(q in x){
                        for(w in y){
                            if(i+q >= 0 && i+q < size && j+w >= 0 && j+w < size){
                                answer[i+q][j+w] = 1
                            }
                        } 
                    }
                }
            }
        }
        return answer.sumBy { row -> row.count { it == 0 } }
    }
}