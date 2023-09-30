package easy
//https://leetcode.com/problems/ugly-number/
class UglyNumber {
    private val primeFactors = intArrayOf(2, 3, 5)
    private var res = false

    fun isUgly(n: Int): Boolean {
        var reminder = n

        for (i in primeFactors.indices) {
            if (reminder ==0) {
                return false
            }
            if (reminder == 1) {
              res =  true
            }
            if (n % primeFactors[i] == 0) {
                reminder = n / primeFactors[i]
                isUgly(reminder)
            }
        }
        return res
    }
}