class Solution {
    fun solution(chicken: Int) = coupon(chicken)
}

tailrec fun coupon(chicken: Int): Int {
    return if (chicken < 10) 0 else chicken / 10 + coupon(chicken / 10 + chicken % 10)
}
