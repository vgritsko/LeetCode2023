package easy

class WeakestRowsMatrix {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        mat.forEachIndexed { index, arr ->
            map[index] = arr.sum()
        }

       return map
            .toList()
            .sortedBy { it.second }
            .toMap()
            .keys
            .take(k)
            .toIntArray()
    }
}