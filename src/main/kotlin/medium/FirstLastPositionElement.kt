package medium

class FirstLastPositionElement {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var start = 0
        var end = nums.size -1

        val targetStartIndex = first(nums,target,start,end)
        val targetEndIndex = last(nums,target,start,end)

        return  intArrayOf(targetStartIndex, targetEndIndex)
    }

    private fun first (nums: IntArray, target: Int, start:Int,end:Int):Int {
        if (end >= start) {
            val mid = start + (end - start)/2
            if ((mid == 0 || nums[mid - 1] < target) && nums[mid] == target)
            {
                return mid
            }
            if ( target > nums[mid]) {
                return first(nums, target, mid + 1, end)
            } else {
                return first(nums, target, start, mid -1)
            }
        }
        return -1
    }

    private fun last(nums: IntArray, target: Int, start:Int,end:Int):Int {
        if (end >= start) {
            val mid = start + (end - start)/2
            if ((mid == end || nums[mid + 1] > target) && nums[mid] == target) {
                return mid
            }
            if ( target < nums[mid]) {
                return  last(nums, target, start, mid - 1)
            } else {
                return last(nums, target, mid + 1, end)
            }
        }
        return -1
    }
}