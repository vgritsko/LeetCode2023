package easy
//https://leetcode.com/problems/squares-of-a-sorted-array/
class SquaresSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        return nums
            .map { it * it }
            .sorted()
            .toIntArray()

    }
}