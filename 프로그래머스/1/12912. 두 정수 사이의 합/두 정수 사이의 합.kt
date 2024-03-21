class Solution {
    fun solution(a: Int, b: Int) = if(a==b) a else if(a>b) (b..a).map{it.toLong()}.sum() else (a..b).map{it.toLong()}.sum()
}