package easy

//https://leetcode.com/problems/string-matching-in-an-array/
class StringMatchingArray {
    fun stringMatching2(words: Array<String>): List<String> {
        val substrings = mutableListOf<String>()
        words.forEach { substring ->
            val wordsCanContain = words.filter { it != substring }
            wordsCanContain.forEach { word ->
                if (substring in word) {
                    substrings.add(substring)
                }
            }
        }
        return substrings
    }

    fun stringMatching(words: Array<String>): List<String> {
        val substrings = mutableSetOf<String>()
        for (i in words.indices) {
            for (j in words.indices) {
                if (i != j) {
                    if (words[i] in words[j]) {
                        substrings.add(words[i])
                    }
                }
            }
        }
        return substrings.toList()
    }
}