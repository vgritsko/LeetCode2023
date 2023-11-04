package easy

class MinimumCommonValue {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        nums1.forEach {
            val res = findInArray(nums2, it)
            if (res > 0) return res
        }
        return -1
    }

    private fun findInArray(nums: IntArray, target: Int): Int {
        val res = -1
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) return target
            else if (nums[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return res
    }
}