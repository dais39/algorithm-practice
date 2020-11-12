package leetcode.problems.add_two_numbers

// https://leetcode.com/problems/add-two-numbers/
class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        requireNotNull(l1)
        requireNotNull(l2)
        return add(l1, l2, 0)
    }

    private fun add(l1: ListNode?, l2: ListNode?, carry: Int): ListNode? {
        if (l1 == null && l2 == null) {
            if (carry == 0) return null
            val node = ListNode(carry)
            node.next = null
            return node
        }

        if (l1 == null) {
            requireNotNull(l2)
            val pair = add(0, l2.`val`, carry)
            val node = ListNode(pair.first)
            node.next = add(null, l2.next, pair.second)
            return node
        }

        if (l2 == null) {
            val pair = add(l1.`val`, 0, carry)
            val node = ListNode(pair.first)
            node.next = add(l1.next, null, pair.second)
            return node
        }

        val pair = add(l1.`val`, l2.`val`, carry)
        val node = ListNode(pair.first)
        node.next = add(l1.next, l2.next, pair.second)
        return node
    }

    private fun add(a: Int, b: Int, c: Int): Pair<Int, Int> {

        val ans = a + b + c

        // if ans = 10, return (0, 1)
        return if (ans < 10) Pair(ans, 0) else Pair(ans - (ans / 10) * 10, ans / 10)
    }
}

