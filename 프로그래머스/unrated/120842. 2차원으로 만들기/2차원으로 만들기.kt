class Solution {
    fun solution(num_list: IntArray, n: Int) = Array(num_list.size/n){ i ->
        Array(n){ j ->
            num_list[i*n+j]
        }
    }
}