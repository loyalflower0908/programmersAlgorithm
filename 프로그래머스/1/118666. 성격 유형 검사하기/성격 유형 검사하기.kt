class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var mbtiList = mutableListOf(0, 0, 0, 0)//RT, CF, JM, AN
        for((index, i) in survey.withIndex()){
            mbtiList = when(choices[index]){
                1 -> mbtiScore(i, -3, mbtiList)
                2 -> mbtiScore(i, -2, mbtiList)
                3 -> mbtiScore(i, -1, mbtiList)
                4 -> mbtiScore(i, 0, mbtiList)
                5 -> mbtiScore(i, 1, mbtiList)
                6 -> mbtiScore(i, 2, mbtiList)
                else -> mbtiScore(i, 3, mbtiList)
            }
        }
        var mbti = ""
        if(mbtiList[0] > 0){
            mbti += "T"
        }else{
            mbti += "R"
        }
        if(mbtiList[1] > 0){
            mbti += "F"
        }else{
            mbti += "C"
        }
        if(mbtiList[2] > 0){
            mbti += "M"
        }else{
            mbti += "J"
        }
        if(mbtiList[3] > 0){
            mbti += "N"
        }else{
            mbti += "A"
        }
        return mbti
    }
}

fun mbtiScore(Q:String, score:Int, List:List<Int>):MutableList<Int>{
    var mbtiList = List.toMutableList()
    when(Q){
        "RT" -> mbtiList[0] += score
        "TR" -> mbtiList[0] -= score
        "CF" -> mbtiList[1] += score
        "FC" -> mbtiList[1] -= score        
        "JM" -> mbtiList[2] += score
        "MJ" -> mbtiList[2] -= score
        "AN" -> mbtiList[3] += score
        else -> mbtiList[3] -= score
    }
    return mbtiList
}

/*
n개의 질문 7개 섵택지 3210123  매우 비동의 1~7 매우 동의
*/