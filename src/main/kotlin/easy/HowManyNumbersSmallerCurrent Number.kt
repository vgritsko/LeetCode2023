package easy

class HowManyNumbersSmallerCurrentNumber {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums[j] < nums[i]) {
                    res[i] = res[i] +1
                }
            }
        }
        return res
    }
}