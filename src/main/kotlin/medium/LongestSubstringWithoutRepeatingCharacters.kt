package medium

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
class LongestSubstringWithoutRepeatingCharacters {
    private val substrings = mutableMapOf<Int, Set<Char>>()
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0

        s.forEachIndexed substr@{ index, c ->
            val chars = mutableSetOf<Char>()
            if (s.substring(index).length == 1) {
                chars.add(s.substring(index)[0])
                substrings[1] = chars
                return@substr
            } else {
                s.substring(index).forEach {
                    if (!chars.add(it)) {
                        substrings[chars.size] = chars
                        return@substr
                    }
                }
                substrings[chars.size] = chars
            }
        }
        return substrings.keys.maxOrNull() ?: 0
    }
}