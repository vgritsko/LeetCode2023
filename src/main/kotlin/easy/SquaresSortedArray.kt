package easy

import kotlin.math.abs

//https://leetcode.com/problems/squares-of-a-sorted-array/
class SquaresSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {

        var leftPointer = 0
        var rightPointer = nums.lastIndex
        var newArrLeftPointer = leftPointer
        var newArrRightPointer = rightPointer
        val newArray = IntArray(nums.size)

        while (leftPointer <= rightPointer){
            if (Math.abs(nums[rightPointer]) > Math.abs(nums[leftPointer])){
                newArray[newArrRightPointer] = nums[rightPointer] * nums[rightPointer]
                rightPointer--
                newArrRightPointer--
            } else if (Math.abs(nums[rightPointer]) < Math.abs(nums[leftPointer])){
                newArray[newArrRightPointer] = nums[leftPointer] * nums[leftPointer]
                leftPointer++
                newArrRightPointer--
            } else if (Math.abs(nums[rightPointer]) == Math.abs(nums[leftPointer])){
                newArray[newArrRightPointer] = nums[rightPointer] *  nums[rightPointer]
                newArray[newArrRightPointer - 1] = nums[leftPointer] * nums[leftPointer]
                rightPointer--
                leftPointer++
                newArrRightPointer--
                newArrLeftPointer++
            }
        }
        return newArray
    }
    fun sortedSquares_old(nums: IntArray): IntArray {
        return nums
            .map { it * it }
            .sorted()
            .toIntArray()

    }
}