package easy
//https://leetcode.com/problems/climbing-stairs/
class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        val arr = IntArray(100) { 0 }
        arr[1] = 1
        arr[2] = 2
        (3 until arr.size).forEach {
            arr[it] = arr[it - 1] + arr[it - 2]
        }
        return arr[n]
    }
}