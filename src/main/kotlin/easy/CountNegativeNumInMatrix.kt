package easy

class CountNegativeNumInMatrix {
    fun countNegatives(grid: Array<IntArray>): Int {
        var res = 0
        grid.forEach {
            res += findNegativeNumsInArray(it)
        }
        return res
    }

    private fun findNegativeNumsInArray (arr:IntArray):Int {
        var left = 0
        var right = arr.lastIndex
        var negativeStart = -1
        while (left <= right){
            var mid = left + (right - left)/2
            if (arr[mid] >=0) {
                left = mid + 1
            } else {
                negativeStart = mid
                right = mid - 1
            }
        }
        if (negativeStart >= 0) return arr.size - negativeStart
        else return 0
    }
}