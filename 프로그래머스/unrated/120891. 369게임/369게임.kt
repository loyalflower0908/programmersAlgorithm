class Solution {
    fun solution(order: Int) = order.toString().count{ it in listOf('3', '6', '9') }
}