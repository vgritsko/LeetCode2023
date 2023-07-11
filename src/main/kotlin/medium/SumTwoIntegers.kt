package medium
//https://leetcode.com/problems/sum-of-two-integers/

class SumTwoIntegers {
    fun getSum(a: Int, b: Int): Int {
        var x = a
        var y = b
        var carry: Int;
        while (y != 0) {
            carry = x and y;
            x = x xor y;
            y = carry shl 1;
        }
        return x
    }
}