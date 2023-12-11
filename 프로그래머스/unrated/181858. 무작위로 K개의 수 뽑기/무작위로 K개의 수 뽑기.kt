class Solution {
    fun solution(arr: IntArray, k: Int) = arr.toSet().toMutableList().let{ if(it.size > k) it.subList(0, k) else if(it.size<k) it.apply{addAll(List(k - it.size) { -1 })}else it}
    
}