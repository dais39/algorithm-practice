fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val h = readLine()!!.split(" ").map { it.toInt() }

    // 初期化
    val dp = Array(N + 100) { Int.MAX_VALUE }
    dp[0] = 0

    // コストの最小値の計算
    for (i in 0 until N) {
        for (k in 1..K) {
            if (i - k < 0) continue
            val c = dp[i - k] + Math.abs(h[i] - h[i - k])
            if (dp[i] > c) dp[i] = c
        }
    }

    println(dp[N - 1])
}
