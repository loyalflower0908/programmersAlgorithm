class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var pgDayList = mutableListOf<Int>()
        for((index, i) in progresses.withIndex()){
            if((100 - i) % speeds[index] != 0){
                pgDayList.add((100 - i) / speeds[index] + 1)
            }else{
                pgDayList.add((100 - i) / speeds[index])
            }
        }
        var day = pgDayList[0]
        var count = 0
        while(pgDayList.size > 0){
            if(pgDayList[0] <= day){
                count++
                pgDayList.removeFirst()
            }else{
                answer.add(count)
                count = 0
                day = pgDayList[0]
            }
        }
        answer.add(count)
        return answer.toIntArray()
    }
}


/*
반례
입력값 〉 [99, 96, 94], [1, 3, 4]
기댓값 〉 [1, 2]
실행 결과 〉 실행한 결괏값 [3]이 기댓값 [1,2]과 다릅니다.
*/