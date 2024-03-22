class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for(i in 1..count){
            answer += (price * i).toLong()
        }
        return if(money.toLong() - answer < 0) answer - money.toLong() else 0L
    }
}