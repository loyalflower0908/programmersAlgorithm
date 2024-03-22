class Solution {
    fun solution(arr: IntArray, divisor: Int) = arr.filter{ it%divisor == 0 }.let{
        if(it.size == 0){
            listOf(-1)
        }else{
            it.sorted()
        }
    }
}