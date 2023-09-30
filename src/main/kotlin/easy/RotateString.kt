package easy
//https://leetcode.com/problems/rotate-string/
class RotateString {
    fun rotateString(s: String, goal: String): Boolean {
        for (i in s.indices) {
            val newS = s.substring(i + 1) + s.substring(0, i + 1)
            if (newS == goal) return true
        }
        return false
    }
}