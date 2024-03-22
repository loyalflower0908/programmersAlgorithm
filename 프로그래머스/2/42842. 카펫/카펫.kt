class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var width = 0
        var height = 0
        for (w in 1..yellow) {
            if (yellow % w == 0) {
                height = w
                width = yellow / w
                if ((width + 2) * 2 + (height + 2) * 2 - 4 == brown) {
                    break
                }
            }
        }

        return intArrayOf(width + 2, height + 2)
    }
}
