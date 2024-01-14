class Solution {
    fun solution(dots: Array<IntArray>) = dots.let {
        val line1 = (it[1][1] - it[0][1]).toDouble() / (it[1][0] - it[0][0]).toDouble()
        val line2 = (it[3][1] - it[2][1]).toDouble() / (it[3][0] - it[2][0]).toDouble()
        val line3 = (it[2][1] - it[0][1]).toDouble() / (it[2][0] - it[0][0]).toDouble()
        val line4 = (it[3][1] - it[1][1]).toDouble() / (it[3][0] - it[1][0]).toDouble()
        val line5 = (it[3][1] - it[0][1]).toDouble() / (it[3][0] - it[0][0]).toDouble()
        val line6 = (it[2][1] - it[1][1]).toDouble() / (it[2][0] - it[1][0]).toDouble()
        if(line1 == line2){
            1
        }else if(line3 == line4){
            1
        }else if(line5 == line6){
            1
        }else{
            0
        }
    }
}
