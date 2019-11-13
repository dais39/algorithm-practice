package atcoder.abc142

fun main(args: Array<String>) {

    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val h = readLine()!!.split(" ").map { it.toInt() }

    val ans = h.count { it >= K }

    println(ans)
}
