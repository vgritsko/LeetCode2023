package easy

class SeparateDigitArray {
    fun separateDigits(nums: IntArray): IntArray {
        var result = mutableListOf<Int>()
        nums.forEach { it ->
            it.toString().forEach {
                result.add(it.digitToInt())
            }
        }
        return result.toIntArray()
    }
}