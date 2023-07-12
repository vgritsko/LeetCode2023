package easy
//https://leetcode.com/problems/is-subsequence/
class IsSubsequence {
    private lateinit var S: String
    private lateinit var T: String
    fun isSubsequence(s: String, t: String): Boolean {
        S = s
        T = t
        return checkSubsequence(s.length - 1, t.length - 1)
    }

    private fun checkSubsequence(i: Int, j: Int): Boolean {
        if (i == -1) return true
        if (j == -1) return false

        if (S[i] == T[j]) {
            return checkSubsequence(i - 1, j - 1)
        } else {
            return checkSubsequence(i, j - 1)
        }
    }
}