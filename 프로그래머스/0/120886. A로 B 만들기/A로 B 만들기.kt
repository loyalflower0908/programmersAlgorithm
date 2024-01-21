class Solution {
    fun solution(before: String, after: String): Int {
        var a = before
        var b = after
        for(i in a){
            b = b.replaceFirst(i.toString(), "")
        }
        if(b.isEmpty()){
            return 1
        }else{
            return 0
        }
    }
}