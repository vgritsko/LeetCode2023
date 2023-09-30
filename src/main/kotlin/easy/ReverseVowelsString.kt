package easy
//https://leetcode.com/problems/reverse-vowels-of-a-string/
class ReverseVowelsString {
    private val vouels = charArrayOf('a','A', 'e','E', 'i','I', 'o','O','u','U')
    fun reverseVowels(s: String): String {
        val array = s.toCharArray()
        var i = 0
        var j = array.size - 1
        var res = 0
        while (i <= j) {
            if (array[i] in vouels && array[j] in vouels) {
                var temp = array[i]
                array[i] = array[j]
                array[j] = temp
                res = 0
//                i++
//                j--
            }
            if (array[i] in vouels && array[j] !in vouels) {
                //j--
                res = 1
            }
            if (array[i] !in vouels && array[j] in vouels) {
                //i++
                res = 2
            }
            if (array[i] !in vouels && array[j] !in vouels) {
                res = 0
//                i++
//                j--
            }
            when (res) {
                0 -> {
                    i++
                    j--
                }

                1 -> j--
                2 -> i++
            }
        }

        return array.joinToString(separator = "")
    }
}