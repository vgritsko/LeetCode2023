package easy

//https://leetcode.com/problems/add-digits/
class AddDigits {
    fun addDigits(num: Int): Int {
        return 1 + (num - 1) % 9
    }
}