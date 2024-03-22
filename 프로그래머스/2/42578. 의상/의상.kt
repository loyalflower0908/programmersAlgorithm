class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val map = HashMap<String, Int>()
        for (i in clothes.indices) {
            val category = clothes[i][1]
            map[category] = map.getOrDefault(category, 0) + 1
        }

        var answer = 1
        for (value in map.values) {
            answer *= (value + 1)
        }

        return answer - 1
    }
}