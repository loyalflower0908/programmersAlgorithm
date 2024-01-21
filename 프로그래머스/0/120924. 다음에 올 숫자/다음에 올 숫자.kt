class Solution {
    fun solution(common: IntArray): Int {
        var check1 = common[1] - common[0]
        var check2 = common[2] - common[1]
        if(check2 == check1){
            //등차수열
            return common.last() + check1
        }else{
            //등비수열
            val key = check2/check1
            return common.last() * key
        }
    }
}