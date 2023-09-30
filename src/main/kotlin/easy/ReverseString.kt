package easy

//https://leetcode.com/problems/reverse-string/
class ReverseString {
    fun reverseString(s: CharArray): Unit {
        var temp = ' '
        if (s.size == 1) return
        if (s.size == 2) {
            temp = s[0]
            s[0] = s[1]
            s[1] = temp
            return
        }
        val halfOfArray: Int = s.size / 2
        for (i in 0 until halfOfArray) {
            temp = s[i]
            s[i] = s[s.size - i - 1]
            s[s.size - i - 1] = temp
        }
    }
}