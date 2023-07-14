package easy

//https://leetcode.com/problems/majority-element/
class MajorityElement {
    private val map = mutableMapOf<Int, Int>()
    fun majorityElement(nums: IntArray): Int {
        nums.forEach {
            map[it] = map[it]?.plus(1) ?: 0
        }
        val maxAppearance = map.values.max()
        return map.filter { it.value == maxAppearance }.keys.first()
    }
}