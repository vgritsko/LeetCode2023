package easy

//1470. Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/
class Solution_shuffle {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val newArray = IntArray(nums.size)
        var j = 0
        for (i in 0 until n) {
            newArray[j] = nums[i]
            newArray[j + 1] = nums[i + n]
            j += 2
        }
        return newArray
    }
}