package medium
//https://leetcode.com/problems/house-robber/
class HouseRobber {
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]

        var l = Math.max(nums[0], nums[1])
        var ll = nums[0]

        for (i in 2 until nums.size) {
            val temp = l
            l = Math.max(l, ll + nums[i])
            ll = temp
        }
        return l
    }
}

