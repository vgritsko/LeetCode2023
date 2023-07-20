package easy
//https://leetcode.com/problems/jewels-and-stones/
class JewelsStones {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        return stones.filter { it in jewels }.length
    }
}