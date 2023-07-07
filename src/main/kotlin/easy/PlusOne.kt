package easy
//https://leetcode.com/problems/plus-one/
class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var increment = 1
        for (i in digits.lastIndex downTo 0) {
            if (digits[i] + increment == 10) {
                digits[i] = 0
                if (i == 0) {
                    digits[i] = 0
                    val newArray = IntArray(digits.size + 1) { 1 }
                    for (i in digits.lastIndex downTo 0) {
                        newArray[i + 1] = digits[i]
                    }
                    return newArray
                }
            } else if (increment == 1) {
                digits[i] += increment
                increment = 0
            }
        }
        return digits
    }
}