package leetcode.problems.reverse_integer

class Solution {

    fun reverse(x: Int): Int {

        if (x < 0) {
            val num: Long = x * -1L

            return internalReverse(num) * -1
        }

        return internalReverse(x.toLong())
    }

    private fun internalReverse(num: Long): Int {
        val s = "$num"
        var a = ""
        for (i in s.length - 1 downTo 0) {
            a += s[i]
        }

        if (a.toLong() > Int.MAX_VALUE || a.toLong() < Int.MIN_VALUE) {
            return 0
        }

        return a.toInt()
    }
}
