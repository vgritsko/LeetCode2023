package easy
//704. Binary Search

class SolutionBinarySearch {
    private var startIndex = 0
    fun search(nums: IntArray, target: Int): Int {

        var low = 0
        var high = nums.size - 1
        var mid: Int
        while (low <= high) {
            mid = low + ((high - low) / 2)
            when {
                target > nums[mid] -> low = mid + 1
                target == nums[mid] -> return mid
                target < nums[mid] -> high = mid
            }
        }
        return -1
    }

}