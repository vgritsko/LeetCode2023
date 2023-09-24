package easy

class NumberGoodPairs {
    fun numIdenticalPairs(nums: IntArray): Int {
        var counter = 0
        nums.forEachIndexed {
                i, it ->
            nums.forEachIndexed {
                    j, it2 ->
                if (nums[i] == nums[j] && i<j) counter++
            }
        }
        return counter
    }
}