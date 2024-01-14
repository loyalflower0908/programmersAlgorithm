class Solution {
    fun solution(numbers: IntArray): Int {
        var a = mutableListOf<Int>()
        var check = mutableListOf<Int>()
        for(i in numbers){
            check.add(i)
            for(j in numbers.filterNot{ it in check}){
                a.add(i*j)
            }
        }
        if(a.size == 0){
            a.add(numbers[0]*numbers[1])
        }
        return a.maxOrNull()!!
    }
}