package easy

class PascaleTriangle2 {
    private val pascaleTriangle = mutableListOf<List<Int>>()
    fun getRow(rowIndex: Int): List<Int> {
        fillPascaleTriangle(rowIndex)
        return pascaleTriangle[rowIndex]
    }

    private fun fillPascaleTriangle(maxRows:Int)  {
        pascaleTriangle.add(listOf(1))
        pascaleTriangle.add(listOf(1,1))
        for (i in 2..maxRows){
            val row = generateRow(i)
            pascaleTriangle.add(row)
        }
    }

    private fun generateRow(size:Int):List<Int>{
        val row = IntArray(size + 1)
        row[0] = 1
        row[size] = 1
        for (i in 1 until size){
            row[i] = pascaleTriangle[size - 1][i-1] + pascaleTriangle[size - 1][i]
        }
        return row.toList()
    }
}