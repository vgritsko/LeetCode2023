package easy
//https://leetcode.com/problems/detect-capital/
class DetectCapital {
    fun detectCapitalUse(word: String): Boolean {
        return  word.matches(Regex("[A-Z]")) ||
                word.matches(Regex("[a-z]")) ||
                word.matches(Regex("[A-Z]{1}[a-z]+"))

    }
}