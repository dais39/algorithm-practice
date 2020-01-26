package leetcode.problems.two_sum

private class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = mutableListOf<Int>()
        for (i in nums.indices) {
            for (j in 0 until i) {
                if (nums[i] + nums[j] == target) {
                    result.add(i)
                    result.add(j)
                }
            }
        }
        result.sort()
        return result.toIntArray()
    }
}
