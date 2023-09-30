package easy
//https://leetcode.com/problems/repeated-substring-pattern/
class RepeatedSubstringPattern {
    fun repeatedSubstringPattern(s: String): Boolean {
        val regex = "^(.*)\\1+\$".toRegex()
        return regex.containsMatchIn(s)
    }
}