class Solution {
    fun solution(num: Int, total: Int): List<Int> {
        val resultList = mutableListOf<Int>()
        
        var key = total / num - num / 2

        if (num % 2 == 1) {
            for (i in 1..num) {
                resultList.add(key++)
            }
        } else {
            for (i in 1..num) {
                resultList.add(++key)
            }
        }

        return resultList
    }
}
