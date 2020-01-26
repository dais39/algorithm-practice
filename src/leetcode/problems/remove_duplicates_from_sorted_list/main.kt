package leetcode.problems.remove_duplicates_from_sorted_list

import kotlin.test.assertEquals

fun main() {

    val first = ListNode(1)
    val second = ListNode(1)
    val third = ListNode(2)
    second.next = third
    first.next = second

    val solution = Solution()
    val answer = solution.deleteDuplicates(first)

    assertEquals(1, answer?.`val`)
    assertEquals(2, answer?.next?.`val`)
    assertEquals(null, answer?.next?.next)
}
