package easy

//1. Two Sum
//https://leetcode.com/problems/two-sum/
class Solution_twoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = nums.mapIndexed { index, i -> i to index }.toMap()
        val res = IntArray(2)
        for (i in nums.indices) {
            val diff = target - nums[i]
            var value = numsMap[diff]
            if (value != null && i != value) {
                res[0] = i
                res[1] = value
                break
            }
        }
        return res
    }
}