package easy

//https://leetcode.com/problems/ransom-note/
class RansomNote {
    private lateinit var ransomeNoteMap: Map<Char, Int>
    private lateinit var magazineMap: Map<Char, Int>
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (ransomNote.isEmpty() || magazine.isEmpty()) return false
        ransomeNoteMap = string2Map(ransomNote)
        magazineMap = string2Map(magazine)
        ransomeNoteMap.forEach {
            try {
                if ((magazineMap[it.key])!! < it.value) {
                    return false
                }
            }
            catch (ex:NullPointerException){
                return false
            }
        }
        return true
    }

    private fun string2Map(s: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        s.forEach {
            map[it] = map[it]?.plus(1) ?: 1
        }
        return map
    }
}