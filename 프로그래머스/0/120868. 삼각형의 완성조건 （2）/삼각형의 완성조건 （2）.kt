class Solution {
    fun solution(sides: IntArray): Int {
        var x = 0
        var y = 0
        for(i in sides) {
            if(i > x) {
                if(x==0){
                    x = i
                }else{
                    y = x
                    x = i
                }
            } else {
                y = i
            }
        }
        return (x-y+1..x+y-1).count()
    }
}