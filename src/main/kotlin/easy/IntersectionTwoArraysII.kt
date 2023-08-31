package easy
//https://leetcode.com/problems/intersection-of-two-arrays/
class IntersectionTwoArraysII {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val intersection = mutableSetOf<Int>()
        nums1.forEachIndexed { i, valNum1 ->
            nums2.forEachIndexed { j, valNum2 ->
                if (valNum1 == valNum2) {
                    intersection.add(valNum1)
                }
            }
        }
       return intersection.toIntArray()
    }
}