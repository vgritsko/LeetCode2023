package main.kotlin.easy

//https://leetcode.com/problems/roman-to-integer/
class Roman2Integer {
    val vocabulary = mapOf<String, Int?>(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000,
        "IV" to 4,
        "IX" to 9,
        "XL" to 40,
        "XC" to 90,
        "CD" to 400,
        "CM" to 900
    )
    var sum = 0

    fun romanToInt(s: String): Int {
        val iterator = s.iterator()
        var accStr = ""

        while (iterator.hasNext()) {
            val charCurrent = iterator.next()
            accStr += charCurrent
            if (accStr.length == 2) {
                if (vocabulary[accStr] != null) {
                    sum += vocabulary[accStr]!!
                    accStr = ""
                } else {
                    sum += vocabulary[accStr[0].toString()]!!
                    accStr = charCurrent.toString()

                }
            }
        }
        if (accStr.isNotBlank()) {
            sum += vocabulary[accStr]!!
        }
        return sum
    }
}