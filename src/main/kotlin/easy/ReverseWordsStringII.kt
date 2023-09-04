package easy

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
class ReverseWordsStringII {
    fun reverseWords(s: String): String {
       val words =  s.split(" ")
        val reversed = mutableListOf<String>()
        words.forEach{
            reversed.add(it.reversed())
        }
        return reversed.joinToString(" ")
    }
}