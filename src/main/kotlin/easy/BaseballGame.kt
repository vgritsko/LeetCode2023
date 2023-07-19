package easy

//https://leetcode.com/problems/baseball-game/
class BaseballGame {
    fun calPoints(operations: Array<String>): Int {
        val results = mutableListOf<Int>()
        operations.forEach { s ->
            when (s) {
                "+" -> results.add(results[results.size - 1] + results[results.size - 2])
                "D" -> results.add(results.last() * 2)
                "C" -> results.removeAt(results.size-1)
                else -> results.add(s.toInt())
            }
        }
        return results.sum()
    }
}