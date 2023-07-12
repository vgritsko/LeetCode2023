package easy
//https://leetcode.com/problems/fibonacci-number/
class FibonacciNumber {
    fun fib(n: Int): Int {
        val vals = IntArray(n + 2)
        vals[0] = 0
        vals[1] = 1
        if (n <= 1) return vals[n]
        for (i in 2..n) {
            vals[i] = vals[i-1] + vals[i-2]
        }
        return vals[n]
    }
}