class Solution {
    fun solution(score: Array<IntArray>) = score.let{
        var avr = it.map{ (it[0].toDouble() + it [1].toDouble()) / 2 }
        var sortedAvr = avr.sortedDescending().distinct()
        var rank = 1
        var rankCheck = 0
        var rankList = IntArray(avr.size){0}
        for(i in sortedAvr){
            for((index, j) in avr.withIndex()){
                if(j == i){
                    rankList[index] = rank
                    rankCheck ++
                }
            }
            rank += rankCheck
            rankCheck = 0
        }
        rankList
    }
}