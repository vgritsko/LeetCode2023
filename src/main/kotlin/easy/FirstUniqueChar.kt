package easy

import java.lang.Exception
//https://leetcode.com/problems/first-unique-character-in-a-string/
class FirstUniqueChar {
    fun firstUniqChar(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        s.forEach { c ->
            map[c] = (map[c] ?: 0) + 1
        }
        try {
            val uniqChar = map
                .filter { it.value == 1 }
                .firstNotNullOf { it.key }
            return s.indexOf(uniqChar)
        } catch (e: Exception) {
            return -1
        }
    }
}