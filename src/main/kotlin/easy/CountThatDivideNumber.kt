package easy

class CountThatDivideNumber {
    fun countDigits(num: Int): Int {
        var digCounter = 0
        num.toString().map {
            if (num % it.digitToInt() === 0) {
                digCounter++
            }
        }
        return digCounter
    }
}