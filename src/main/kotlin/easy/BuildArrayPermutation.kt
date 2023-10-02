package easy

class BuildArrayPermutation {
    fun buildArray(nums: IntArray): IntArray {
        val newNums = IntArray(size = nums.size)
        nums.forEachIndexed{ index, it ->
            newNums[index] = nums[it]
        }
        return newNums
    }
}