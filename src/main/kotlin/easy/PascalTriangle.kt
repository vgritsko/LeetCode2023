package easy
//https://leetcode.com/problems/pascals-triangle/
class PascalTriangle {
    val result = mutableListOf<List<Int>>()
    fun generate(numRows: Int): List<List<Int>> {
        for (i in 1..numRows) {
            result.add(fillRow(i))
        }
        return result
    }
    private fun fillRow(size: Int): List<Int> {
        if (size == 1) {
            return listOf(1)
        }
        if (size == 2) {
            return listOf(1, 1)
        }
        val newRow = MutableList(size) { 1 }
        for (index in 1 until size - 1) {
            newRow[index] = result[size - 2][index - 1] + result[size - 2][index]
        }
        return newRow
    }
}