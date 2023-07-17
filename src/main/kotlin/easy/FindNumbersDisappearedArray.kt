package easy
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class FindNumbersDisappearedArray {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val seq = sequence {
            yieldAll(generateSequence(1) { it + 1 })
        }
        return seq
            .take(nums.size)
            .filter { it !in nums }
            .toList()
    }
}