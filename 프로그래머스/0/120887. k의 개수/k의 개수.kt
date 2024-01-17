class Solution {
    fun solution(i: Int, j: Int, k: Int) = (i..j).map{ it.toString().count{ k.digitToChar() in it.toString()}}.sum()
}