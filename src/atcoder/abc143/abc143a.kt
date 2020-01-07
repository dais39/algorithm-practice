package atcoder.abc143

fun main(args: Array<String>) {

    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    val ans = if (a > 2 * b) a - 2 * b else 0
    println(ans)
}
