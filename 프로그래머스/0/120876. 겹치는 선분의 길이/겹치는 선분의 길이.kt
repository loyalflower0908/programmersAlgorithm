class Solution {
    fun solution(lines: Array<IntArray>) = lines.let{ line ->
        var overlap1 = (line[0][0]+1..line[0][1]).filter{ (line[1][0]+1..line[1][1]).contains(it) } + (line[0][0]+1..line[0][1]).filter{ (line[2][0]+1..line[2][1]).contains(it) }
        var overlap2 = (line[1][0]+1..line[1][1]).filter{ (line[2][0]+1..line[2][1]).contains(it) }
        var result = overlap1 + overlap2
        result.distinct().size
    }
}
