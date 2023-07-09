package easy

class FindIndexFirstOccurrenceString {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.length > haystack.length) return -1
        val size = needle.length
        val needleHash = needle.fold(0) { acc, c -> acc + c.code }
        for (i in 0..haystack.length - size) {
            val subStr = haystack.substring(i, i + size)
            val subStrHash = subStr.fold(0) { acc, c -> acc + c.code }
            if (subStrHash == needleHash && subStr == needle) return i
        }
        return -1
    }
}