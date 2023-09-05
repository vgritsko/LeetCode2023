package easy

class KidsWithGreatestNumberCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val res = mutableListOf<Boolean>()
        val maxVal = candies.max()
        candies.forEach {
            var temp = it + extraCandies
            if (temp >= maxVal) {
                res.add(true)
            } else {
                res.add(false)
            }
        }
        return res
    }
}