class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers, target, 0, 0)
    }

    fun dfs(numbers: IntArray, target: Int, index: Int, current: Int): Int {
        if (index == numbers.size) {
            return if (current == target) 1 else 0
        } else {
            val num = numbers[index]
            val add = dfs(numbers, target, index + 1, current + num)
            val subtract = dfs(numbers, target, index + 1, current - num)
            return add + subtract
        }
    }
}