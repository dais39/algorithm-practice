package leetcode.problems.kth_largest_element

import java.util.*

class KthLargest(k: Int, nums: IntArray) {

    val k: Int = k
    private val queue = PriorityQueue<Int>(k).apply {
        for(i in nums){
            offer(i)
            if(size > k){
                poll()
            }
        }
    }

    fun add(`val`: Int): Int {
        queue.offer(`val`)
        if(queue.size > k){
            queue.poll()
        }

        return queue.peek()
    }
}
