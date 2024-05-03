class Solution {
    fun solution(numbers: IntArray) = numbers.let{
        var l = mutableSetOf<Int>()
        var s = it.size
        for(i in 0 until s){
            for(j in i+1 until s){
                l.add(it[i]+it[j])
            }
        }
        l.sorted()
    }
}   