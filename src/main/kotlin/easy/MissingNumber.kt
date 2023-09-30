package easy
//https://leetcode.com/problems/missing-number/
class MissingNumber {

    fun missingNumber(nums: IntArray): Int {
        if (nums.size == 1) {
            return if (nums[0] == 0) {
                1
            } else {
                0
            }
        }
        var sum = 1
        for (i in 2..nums.size) {
            sum += i
            sum -= nums[i - 2]
        }
        sum -= nums.last()
        return sum
    }
}