package easy
//https://leetcode.com/problems/fizz-buzz/
class FuzzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val seq: Sequence<Int> = generateSequence(1) { it + 1 }
        return seq.map {
            if (it % 3 == 0 && it % 5 != 0) {
                "Fizz"
            } else if (it % 5 == 0 && it % 3 != 0) {
                "Buzz"
            } else if (it % 5 == 0 && it % 3 == 0) {
                "FizzBuzz"
            } else {
                it.toString()
            }
        }
            .take(n)
            .toList()
    }
}