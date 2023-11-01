package easy

//121. Best Time to Buy and Sell Stock
class BestTimeForStocks {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = Int.MIN_VALUE
        var minValue = prices[0]

        for (i in prices.indices){
            minValue = minOf(minValue,prices[i])
            maxProfit = maxOf(maxProfit,prices[i] - minValue)
        }
        return maxProfit
    }
}