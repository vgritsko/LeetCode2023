package easy
//https://leetcode.com/problems/arranging-coins/
class ArrangingCoins {
    fun arrangeCoins(n: Int): Int {
        var counter = n
        val seq = sequence {
            yieldAll(generateSequence(1) { it + 1 })
        }

        return seq
            .map { counter -= it}
            .takeWhile { counter >= 0 }
            .count()
    }
}