package leetcode.problems.two_sum

private class Solution {

    // brute force
    fun _twoSum(nums: IntArray, target: Int): IntArray {
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

    // hash table
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.contains(complement) && map[complement] != i) {
                return intArrayOf(i, map.get(complement)!!)
            }
        }
        throw IllegalArgumentException()
    }
}
