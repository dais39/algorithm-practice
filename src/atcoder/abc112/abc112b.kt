package atcoder.abc112

fun main(args: Array<String>) {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    val ct = (1..n).map { readLine()!!.split(" ").map { it.toInt() } }

    val ans = ct.filter { it.last() <= t }.minBy { it.first() }

    ans?.let { println(ans[0]) } ?: println("TLE")
}
