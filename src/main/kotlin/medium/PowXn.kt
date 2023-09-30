package medium

import java.math.BigDecimal
import kotlin.math.pow
//https://leetcode.com/problems/powx-n/
class PowXn {

    fun myPow (x: Double, n: Int): Double {
        return x.pow(n.toDouble())
    }

    fun myPow_old(x: Double, n: Int): Double {
        val values = arrayOfNulls<Double>(2)
        if (n >= 0) {
//            values[0] = 1.0
//            values[1] = x
//            values[2] = x * x
//            var i = 1
//            while (i <= n) {
//                if (values[i]!=null) {
//                    values[i] = x * values[i - 1]!!
//                }
//
//                i++
//            }
//            return values[n] ?: 0.0

            if (n == 0) return 1.0
            if (n == 1) return x
            if (n == 2) return x * x
            values[0] = x * x
            var index = 3.0
            while (index <= n) {
                println(index)
                values[1] = x * values[0]!!
                values[0] = values[1]
                index++
            }
       //     accum *= x
            return x * myPow(x, n - 1)
        } else {
            if (n == -1) return 1 / x
            if (n == -2) return (1 / x) * (1 / x)
        //    accum *= (1 / x)
            return 1 / x * (myPow(x, n + 1))
        }
    }



}