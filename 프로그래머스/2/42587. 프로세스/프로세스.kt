class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var mapPrio = priorities.mapIndexed{index, it -> index to it}.toMutableList()
        var count = 0
        while(mapPrio.size > 0){
            var mapPrioMax = mapPrio.maxOf{it.second}
            while(mapPrio[0].second != mapPrioMax){
                mapPrio.add(mapPrio.removeAt(0))
            }
            count++
            if(mapPrio.removeAt(0).first == location){
                return count
            }
        }
        return -1
    }
}