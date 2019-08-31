package atcoder.abc067

fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map{it.toInt()}
    val sortedL = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()

    val ans = sortedL.take(K).sum()

    println(ans)
}
