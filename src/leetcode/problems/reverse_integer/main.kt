package leetcode.problems.reverse_integer

fun main(args: Array<String>) {

    val solution = Solution()

    val ans = solution.reverse(1234)
    val ans2 = solution.reverse(-1234)
    val ans3 = solution.reverse(Int.MIN_VALUE)
    val ans4 = solution.reverse(Int.MAX_VALUE)

    println(ans)
    println(ans2)
    println(ans3)
    println(ans4)
}
