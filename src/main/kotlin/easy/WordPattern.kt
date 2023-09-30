package easy

//https://leetcode.com/problems/word-pattern/
class WordPattern {
    val map = mutableMapOf<Char, String>()
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if (pattern.length != words.size) return false
        pattern.forEachIndexed { index, c ->
            if (!map.containsKey(c) && !map.containsValue(words[index])) {
                map[c] = words[index]
            } else {
                if (map[c] != words[index])
                    return false
            }
        }
        return true
    }
}