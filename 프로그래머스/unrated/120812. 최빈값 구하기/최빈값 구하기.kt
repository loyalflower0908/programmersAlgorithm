class Solution {
    fun solution(array: IntArray):Int{
        val sizeMap = array.groupBy { it }.mapValues { it.value.size }
        val maxCount = sizeMap.maxByOrNull { it.value }?.value?:-1
        val mostHigh = sizeMap.filter { it.value == maxCount }.keys
        return if(mostHigh.size == 1) mostHigh.first() else -1
    }
}