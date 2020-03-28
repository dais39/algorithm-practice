package leetcode.problems.intersection_of_two_array

class IntersectionTwoArray {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()
        return set1.filter { set2.contains(it) }.toIntArray()
    }
}
