class Solution {
    fun solution(n: Int): Array<IntArray> {
        val result = Array(n) { IntArray(n) }

        var num = 1
        var rowStart = 0
        var rowEnd = n - 1
        var colStart = 0
        var colEnd = n - 1

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (i in colStart..colEnd) {
                result[rowStart][i] = num++
            }
            rowStart++

            for (i in rowStart..rowEnd) {
                result[i][colEnd] = num++
            }
            colEnd--

            if (rowStart <= rowEnd) {
                for (i in colEnd downTo colStart) {
                    result[rowEnd][i] = num++
                }
                rowEnd--
            }

            if (colStart <= colEnd) {
                for (i in rowEnd downTo rowStart) {
                    result[i][colStart] = num++
                }
                colStart++
            }
        }

        return result
    }
}