package atcoder.edpc

fun main(args: Array<String>) {

    val (N, W) = readLine()!!.split(" ").map { it.toInt() }

    val dp = Array(N+1) { LongArray(W+1) { 0 } }

    for (i in 1..N) {
        val (w, v) = readLine()!!.split(" ").map { it.toInt() }
        for (j in 1..W) {

            // itemを選ぶとき
            if (j - w >= 0) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - w] + v)
                continue
            }
            // itemを選ばないとき
            dp[i][j] = dp[i-1][j]
        }
    }

    println(dp[N][W])
}
