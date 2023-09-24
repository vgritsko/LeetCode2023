package medium
//https://leetcode.com/problems/find-the-duplicate-number/description/?source=submission-ac
class FindDuplicateNumber {
    fun findDuplicate(nums: IntArray): Int {
        for (element in nums) {
            val index = element % nums.size;
            nums[index] += nums.size;
        }
        for ( i in nums.indices) {
            if (nums[i] / nums.size >= 2) {
                return i
            }
        }
        return -1
    }
}