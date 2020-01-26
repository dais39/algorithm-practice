package leetcode.problems.remove_duplicates_from_sorted_list

class Solution {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current?.next != null) {
            if (current.`val` == current.next?.`val`) {
                current.next = current.next?.next
            } else {
                current = current.next
            }
        }
        return head
    }
}
