package easy

class FindDiffrerence {
    fun findTheDifference(s: String, t: String): Char {
        val mapS = mutableMapOf<Char, Int>()
        s.forEach {
            mapS[it] = (mapS[it] ?: 0) + 1
        }
        val mapT = mutableMapOf<Char, Int>()
        t.forEach {
            mapT[it] = (mapT[it] ?: 0) + 1
        }
        mapS.forEach {
            if (mapT[it.key] != it.value) return it.key
        }
        return mapT.filter { it !in mapS.entries }.keys.first()
    }
}