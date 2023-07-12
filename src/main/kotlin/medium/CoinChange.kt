package medium
//https://leetcode.com/problems/coin-change/
class CoinChange {
    //    fun coinChange(coins: IntArray, amount: Int): Int {
//        if (amount == 0) {
//            return 0
//        }
//        if (amount < 0) {
//            return -1
//        }
//        var coinsAmount = -1
//        coins.forEach {
//            val result = coinChange(coins = coins, amount - it)
//            if (result != -1) {
//                coinsAmount = result+1
//            }
//        }
//        return coinsAmount
//    }
//    fun coinChange(coins: IntArray, amount: Int): Int {
//        coins.sort()
//        val dp = IntArray(amount + 1)
//        for (i in 1..amount) {
//            dp[i] = -1
//            var result = -1
//
//            coins.forEach {
//                if (i - it >= 0) {
//                    result = dp[i - it]
//                }
//                if (result != -1) {
//                    dp[i] = result + 1
//                }
//            }
//        }
//        return dp[amount]
//    }

    fun coinChange(coins: IntArray, amount: Int): Int {
        return if (amount < 1)
            0
        else
            coinChange(coins, amount, IntArray(amount))
    }

    private fun coinChange(coins: IntArray, amountRemaining: Int, solutions: IntArray): Int {
        if (amountRemaining < 0) return -1
        if (amountRemaining == 0) return 0

        if (solutions[amountRemaining - 1] != 0)
            return solutions[amountRemaining - 1]

        var optimalSolution = Int.MAX_VALUE


        for (coin in coins) {
            val solutionUsingThisCoin = coinChange(coins, amountRemaining - coin, solutions)
            if (solutionUsingThisCoin in 0 until optimalSolution) {
                optimalSolution = solutionUsingThisCoin + 1
            }
        }

        solutions[amountRemaining - 1] =
                if (optimalSolution == Int.MAX_VALUE)
                    -1
                else
                    optimalSolution

        return solutions[amountRemaining - 1]
    }
}