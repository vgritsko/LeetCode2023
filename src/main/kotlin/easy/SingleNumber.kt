package easy

//https://leetcode.com/problems/single-number/
class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var element = 0
        nums.forEach {
            element = element xor it
        }
        return element
    }
}