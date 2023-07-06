package easy

//https://leetcode.com/problems/longest-common-prefix/
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.any { it.isEmpty() }) return ""

        val commonChars = mutableListOf<Char>()
        commonChars.add(strs.first()[0])
        var minLength = strs.first().length
        var charPositionCounter = 0
        while (charPositionCounter < minLength) {
            strs.forEach {
                if (commonChars.size <= charPositionCounter) {
                    commonChars.add(it[charPositionCounter])
                }
                if (it[charPositionCounter] != commonChars[charPositionCounter]) {
                    commonChars.removeAt(charPositionCounter)
                    return commonChars.joinToString("")
                }
                if (it.length < minLength) {
                    minLength = it.length
                }
            }
            charPositionCounter++
        }
        return commonChars.joinToString("")
    }
}