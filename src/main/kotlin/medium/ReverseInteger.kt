package medium

class ReverseInteger {
    fun reverse(x: Int): Int {
        var nums = x
        var ans = 0
        val isNegative = x < 0

        nums = Math.abs(nums)
        while (nums > 0) {

            if (ans > Int.MAX_VALUE / 10) {
                return 0
            }
            ans = ans * 10 + nums % 10
            nums /= 10
        }
        return if (isNegative) -ans else ans
    }

}