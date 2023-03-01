package easy

class SolutionValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()

        s.forEach {
            sMap[it] = sMap.getOrDefault(it, 0) + 1
        }
        t.forEach {
            tMap[it] = tMap.getOrDefault(it, 0) + 1
        }
        return sMap == tMap
    }
}