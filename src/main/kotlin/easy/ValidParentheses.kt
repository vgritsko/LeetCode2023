package easy

import java.util.Stack
//20. Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/
class Solution_ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val mapOfPairs = mapOf(
            '}' to '{',
            ')' to '(',
            ']' to '['
        )

        s.forEach {
            stack.push(it)
            if (mapOfPairs.containsKey(it)) {
                if (stack.size < 2) {
                    return false
                }
                if (stack[stack.size - 2] != mapOfPairs[it]) {
                    return false
                }
                stack.pop()
                stack.pop()
            }
        }
        return stack.isEmpty()
    }
}