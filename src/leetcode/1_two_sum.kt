package leetcode

private class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = mutableListOf<Int>()
        for(i in 0 until nums.size){
            for(j in 0 until i){
                if(nums[i] + nums[j] == target){
                    result.add(i)
                    result.add(j)
                }
            }
        }
        result.sort()
        return result.toIntArray()
    }
}
