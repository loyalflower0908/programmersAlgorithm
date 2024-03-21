class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = mutableMapOf<Int,Double>()
        for(i in 1..N) {
            val userCnt = stages.count { it == i }
            val clearUsrCnt = stages.count { it >= i }
            answer[i] = if (clearUsrCnt != 0) userCnt.toDouble() / clearUsrCnt.toDouble() else 0.0
        }
        val sortedKeys = answer.toList()
            .sortedByDescending { it.second }
            .map { it.first }
            .toIntArray()
            
        return sortedKeys
    }
}

/*
    문제: 신규 사용자와 기존 사용자 사이의 스테이지 차이가 너무 큼
    동적으로 게임시간을 늘려 난이도 조절
    실패율을 구하는 코드! 
    스테이지에 도달, 클리어 X 유저수 / 스테이지에 도달 유저 수 -> 실패율
    전체 스테이지 개수 N, 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages
    실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열 리턴
    실패율이 같으면 작은 번호의 스테이지가 먼저오게 한다.
*/