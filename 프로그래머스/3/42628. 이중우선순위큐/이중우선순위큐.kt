import java.util.*

class Solution {
    fun solution(operations: Array<String>): IntArray {
        val maxHeap = PriorityQueue<Int>(Comparator.reverseOrder())
        val minHeap = PriorityQueue<Int>()

        for (operation in operations) {
            val (cmd, num) = operation.split(" ")
            when (cmd) {
                "I" -> {
                    val number = num.toInt()
                    maxHeap.offer(number)
                    minHeap.offer(number)
                }
                "D" -> {
                    if (maxHeap.isEmpty() || minHeap.isEmpty()) continue
                    val number = num.toInt()
                    if (number == 1) {
                        val max = maxHeap.poll()
                        minHeap.remove(max)
                    } else if (number == -1) {
                        val min = minHeap.poll()
                        maxHeap.remove(min)
                    }
                }
            }
        }

        return if (maxHeap.isEmpty() || minHeap.isEmpty()) intArrayOf(0, 0)
        else intArrayOf(maxHeap.peek(), minHeap.peek())
    }
}