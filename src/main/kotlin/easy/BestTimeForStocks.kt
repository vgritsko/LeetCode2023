package easy

//121. Best Time to Buy and Sell Stock
class BestTimeForStocks {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (i in prices.indices) {
            for (j in i + 1 until prices.size) {
                val profit = prices[j] - prices[i]
                if (profit > maxProfit) maxProfit = profit
            }
        }
        return maxProfit
    }
}