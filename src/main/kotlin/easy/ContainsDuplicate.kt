package easy
//https://leetcode.com/problems/contains-duplicate/
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size == nums.distinct().size
    }
}