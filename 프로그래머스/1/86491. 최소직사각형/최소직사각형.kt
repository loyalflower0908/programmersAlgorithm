class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0

        for (size in sizes) {
            val width = size[0]
            val height = size[1]

            if (width < height) {
                maxWidth = maxOf(maxWidth, height)
                maxHeight = maxOf(maxHeight, width)
            } else {
                maxWidth = maxOf(maxWidth, width)
                maxHeight = maxOf(maxHeight, height)
            }
        }

        return maxWidth * maxHeight
    }
}

/*
*/