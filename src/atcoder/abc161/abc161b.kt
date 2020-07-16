package atcoder.abc161

fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val total = a.sum()
    val answer = if (a.filter { it >= total / (4.0 * m) }.size >= m) "Yes" else "No"

    println(answer)
}