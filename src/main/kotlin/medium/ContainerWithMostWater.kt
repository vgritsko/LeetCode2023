package medium

import kotlin.math.max
import kotlin.math.min
//https://leetcode.com/problems/container-with-most-water/
class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var square = 0
        var left = 0
        var right = height.size - 1
        while (left < right) {
            square = max(square, (right - left) * min(height[left], height[right]))
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return square
    }
}