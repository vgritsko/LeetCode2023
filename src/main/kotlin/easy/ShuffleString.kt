package easy
//1528. Shuffle String
class ShuffleString {
    fun restoreString(s: String, indices: IntArray): String {
        val map = mutableMapOf<Int, Char>()
        s.forEachIndexed { index, c -> map[indices[index]] = c }
        return map.toSortedMap().values.joinToString(separator = "")
    }
}