package easy

class CountPairsSumLessTarget {
    fun countPairs(nums: List<Int>, target: Int): Int {
        var counter = 0
        for (i in 0..nums.size - 2) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] < target) {
                    counter++
                }
            }
        }
        return counter
    }
}