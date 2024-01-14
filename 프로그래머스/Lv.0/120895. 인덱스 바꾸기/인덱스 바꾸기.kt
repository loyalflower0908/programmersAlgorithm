class Solution {
    fun solution(my_string: String, num1: Int, num2: Int) = my_string.toCharArray().let{ a ->
        a[num1] = my_string[num2]
        a[num2] = my_string[num1]
        String(a)
    }
}