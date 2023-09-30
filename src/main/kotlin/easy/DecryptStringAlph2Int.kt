package easy
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
class DecryptStringAlph2Int {
    private val range = 'a'..'z'
    fun freqAlphabets(s: String): String {
        val dictionary = mutableListOf<Char>()
        var i = s.length - 1
        while (i >= 0) {
            if (s[i] == '#') {
                val num = s.substring(i - 2, i).toInt() - 1
                dictionary.add(range.elementAt(num))
                i -= 3
            } else {
                val num = s.elementAt(i).toString().toInt() - 1
                dictionary.add(range.elementAt(num))
                i -= 1
            }
        }
        return String(dictionary.toCharArray()).reversed()
    }
}