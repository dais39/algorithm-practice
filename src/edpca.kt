fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val h = readLine()!!.split(" ").map { it.toInt() }

    val dp = Array(100005){ Int.MAX_VALUE}

    dp[0] = 0
    dp[1] = Math.abs(h[0]-h[1])
    for(i in 2 until n){
        if(dp[i-2] + Math.abs(h[i] - h[i-2]) >= dp[i-1] + Math.abs(h[i] - h[i-1])) {
            dp[i] = dp[i-1] + Math.abs(h[i] - h[i-1])
        }else{
            dp[i] = dp[i-2] + Math.abs(h[i] - h[i-2])
        }
    }

    println(dp[n-1])
}
