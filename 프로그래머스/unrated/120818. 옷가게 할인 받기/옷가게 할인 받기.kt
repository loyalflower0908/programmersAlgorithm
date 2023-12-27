class Solution {
    fun solution(price: Int): Int {
        if(price in 100000 until 300000){
            return price*95/100
        }else if(price in 300000 until 500000) {
            return price*90/100
        }else if(price >= 500000) {
            return price*80/100
        }else {
            return price
        }
    }
}