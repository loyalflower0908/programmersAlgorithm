class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val xValues = dots.map { it[0] }
        val yValues = dots.map { it[1] }

        val minX = xValues.minOrNull() ?: 0
        val maxX = xValues.maxOrNull() ?: 0
        val minY = yValues.minOrNull() ?: 0
        val maxY = yValues.maxOrNull() ?: 0

        val width = maxX - minX
        val height = maxY - minY

        return width * height
    }
}
