package easy

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
class FinalValueVariableAfterPerformingOperations {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        return operations.fold(0) { acc, i -> acc + operate(acc, i) }
    }

    private fun operate(value: Int, operation: String): Int {
        when (operation) {
            "X++", "++X" -> return +1
            "X--", "--X" -> return -1
            else -> throw IllegalArgumentException()
        }
    }
}