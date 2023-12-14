class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var realList = mutableListOf<Int>()
        rank.forEachIndexed{ index, element -> 
            if(attendance[index]){
                realList.add(element)
            }
        }
        realList.sort()
        return (10000*rank.indexOf(realList[0])+100*rank.indexOf(realList[1])+rank.indexOf(realList[2]))
    }
}