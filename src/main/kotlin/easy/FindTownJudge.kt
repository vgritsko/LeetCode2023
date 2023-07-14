package easy

import java.lang.Exception
//https://leetcode.com/problems/find-the-town-judge/
class FindTownJudge {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        if (n == 1) return  1
        val map = object : HashMap<Int, Int>() {
            init {
                for (i in 1..n) {
                    put(i, 0)
                }
            }
        }

        trust.forEach {
            map[it[1]] = map[it[1]]?.plus(1) ?: 0
            map[it[0]] = map[it[0]]?.minus(1) ?: 0
        }

        val res = map.filter { it.value > 0 }
        try {
            if (res.isNotEmpty()) {
                return res.filter { it.value == n - 1 }.keys.first()
            } else {
                return -1
            }
        } catch (ex: Exception) {
            return -1
        }

//        if (res.isNotEmpty()) {
//            return res.filter { it.value == n - 1 }.keys.first()
//        } else {
//            return -1
//        }
    }
}