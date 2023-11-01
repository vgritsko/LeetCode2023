package easy

import java.util.*

class BackspaceStringCompare {
    fun backspaceCompare(s: String, t: String): Boolean {
        val stack = Stack<Char>()
        fillStack(s,stack)
        val resS = stack.joinToString()
        stack.clear()

        fillStack(t,stack)
        val resT = stack.joinToString()

        return resS == resT
    }

    private fun fillStack(s:String, stack: Stack<Char>){
        s.forEach {
            if (it == '#' && !stack.empty()) stack.pop()
            else if (it != '#') stack.push(it)
        }
    }
}