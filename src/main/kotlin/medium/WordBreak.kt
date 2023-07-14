package medium
//https://leetcode.com/problems/word-break/
class WordBreak {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val dp = BooleanArray(s.length + 1)
        dp[s.length] = true
        for (index in s.indices.reversed()) {
            wordDict.forEach { word ->
                if (word.length <= s.substring(index).length) {
                    if (word == s.substring(index, index + word.length)) {
                        if (dp[index + word.length])
                            dp[index] = true
                    }
                }
            }
        }
        return dp[0]
    }
}