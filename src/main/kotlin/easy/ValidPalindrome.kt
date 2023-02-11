package easy
//125. Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/
class Solution_ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val regex = "[^A-Za-z0-9]+".toRegex()
        val filteredStr = s.replace(regex,"").toLowerCase()
        return filteredStr == filteredStr.reversed()

    }
}