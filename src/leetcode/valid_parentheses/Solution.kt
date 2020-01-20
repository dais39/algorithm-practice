package leetcode.valid_parentheses

import java.util.*

class Solution {

    fun isValid(s: String): Boolean {

        val stack = Stack<Char>()

        if(s.isEmpty()) return false
        if (listOf(')', '}', ']').contains(s.first())) return false

        s.forEach {
            when (it) {
                ')' -> {
                    val c = stack.pop()
                    if (c != '(') {
                        stack.push(c)
                        return false
                    }
                }
                '}' -> {
                    val c = stack.pop()
                    if (c != '{') {
                        stack.push(c)
                        return false
                    }
                }
                ']' -> {
                    val c = stack.pop()
                    if (c != '[') {
                        stack.push(c)
                        return false
                    }
                }
                else -> {
                    stack.push(it)
                }
            }
        }

        return stack.empty()
    }
}
