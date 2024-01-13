class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var netName = 1
        var netList = Array(computers.size){ 0 }
        fun netCheck(com:Int){
            netList[com] = netName
            for(i in 0 until n) {
                if (computers[com][i] == 1 && netList[i] == 0) {
                    netCheck(i)
                }
            }
        }
        for(i in 0 until n) {
            if(netList[i]==0){
                netCheck(i)
                netName++
            }
        }
        return netName - 1
    }
}