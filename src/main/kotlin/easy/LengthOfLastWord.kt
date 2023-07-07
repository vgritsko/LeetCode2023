package easy
//https://leetcode.com/problems/length-of-last-word/

class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        if (s.isBlank()) return 0
        return s
                .split(" ")
                .last { it != "" }
                .length
    }
}