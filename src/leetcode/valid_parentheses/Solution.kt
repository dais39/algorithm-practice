package leetcode.valid_parentheses

import java.util.*

class Solution {

    fun isValid(s: String): Boolean {

        val stack = Stack<Char>()
        val map = mapOf(')' to '(', '}' to '{', ']' to '[')

        if(s.isEmpty()) return true
        if (listOf(')', '}', ']').contains(s.first())) return false

        s.forEach {
            if (map.containsKey(it)) {
                if (stack.empty()) return false
                val c = stack.pop()
                if (c != map[it]) {
                    stack.push(c)
                    return false
                }
            } else {
                stack.push(it)
            }
        }

        return stack.empty()
    }
}
