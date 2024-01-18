class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var result = intArrayOf(0,0)
        var maxX = (board[0]-1)/2
        var maxY = (board[1]-1)/2
        for(i in keyinput){
            when(i){
                "left" -> result[0] -= 1
                "right" -> result[0] += 1
                "up" -> result[1] += 1
                else -> result[1] -= 1
            }
            when {
                result[0] > maxX -> result[0] = maxX
                result[0] < -maxX -> result[0] = -maxX
                else -> {}
            }
            when {
                result[1] > maxY -> result[1] = maxY
                result[1] <-maxY -> result[1] = -maxY
                else -> {}
            }
        }
        return result
    }
}