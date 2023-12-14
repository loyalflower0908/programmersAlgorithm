class Solution {
    fun solution(strArr: Array<String>): Int {
        var countList = MutableList(strArr.size){0}
        for(i in strArr){
            countList[i.length-1] += 1
        }
        return countList.maxOrNull() ?: 0
    }
}