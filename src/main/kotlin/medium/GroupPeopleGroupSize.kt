package medium

class GroupPeopleGroupSize {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val table = mutableMapOf<Int, MutableList<Int>>()
        groupSizes.forEachIndexed { index, i ->
            if (table[i] == null) {
                table[i] = mutableListOf(index)
            } else {
                table[i]?.add(index)
            }
        }
        val res = mutableListOf<List<Int>>()
        table.forEach { (i, ints) ->
            if (ints.size / i > 1) {
                ints.chunked(i).forEach {
                    res.add(it)
                }
            } else {
                res.add(ints)
            }
        }
        return res
    }
}