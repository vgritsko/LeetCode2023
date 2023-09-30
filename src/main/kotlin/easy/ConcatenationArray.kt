package easy
//https://leetcode.com/problems/concatenation-of-array/submissions/
class ConcatenationArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val dest =IntArray(size*2)
        System.arraycopy(nums,0,dest,0,size)
        System.arraycopy(nums,0,dest,size-1,size)
        return dest
    }
}