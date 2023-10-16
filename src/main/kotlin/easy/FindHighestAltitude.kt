package easy

class FindHighestAltitude {
    fun largestAltitude(gain: IntArray): Int {
        return gain
            .runningFold(0) { sum, element -> sum + element }
            .max()
    }
}