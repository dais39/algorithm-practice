package leetcode.reverse_linked_list

fun main(args: Array<String>) {

    val head = ListNode(2)
    head.next = ListNode(3)
    val answer = Solution().reverseList(head)

    println(answer?.`val`)
    println(answer?.next?.`val`)
}
