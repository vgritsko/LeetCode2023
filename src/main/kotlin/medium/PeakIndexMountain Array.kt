package medium

class PeakIndexMountainArray {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 0
        var right = arr.lastIndex
        val lastIndex = arr.lastIndex
        var targetIndex = 0

        while (left <= right) {
            val mid = left + (right - left)/2
            if (mid == lastIndex-1 || arr[mid] > arr[mid+1]){
                targetIndex = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return targetIndex
    }
}