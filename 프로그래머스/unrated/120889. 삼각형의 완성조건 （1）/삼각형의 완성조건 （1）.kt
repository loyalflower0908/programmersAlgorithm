class Solution {
    fun solution(sides: IntArray): Int {
        var a = sides.sorted()
        if(a[2] < a[0] + a[1]){
            return 1
        }else{
            return 2
        }
    }
}