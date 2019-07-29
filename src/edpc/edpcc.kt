package edpc

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val actions = (1..n).map { readLine()!!.split(" ").map { it.toInt() }.toTypedArray() }.toTypedArray()

    val dp = Array(n) { Array(3) { 0 } }

    dp[0][0] = actions[0][0]
    dp[0][1] = actions[0][1]
    dp[0][2] = actions[0][2]
    for (i in 1 until n) {
        for (j in 0 until 3) {
            dp[i][j] = Math.max(dp[i - 1][(j + 1) % 3], dp[i - 1][(j + 2) % 3]) + actions[i][j]
        }
    }

    println(listOf(dp[n-1][0], dp[n-1][1], dp[n-1][2]).max())
}
