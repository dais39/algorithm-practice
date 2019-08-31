package atcoder.abc129

fun main(args: Array<String>) {
    val times = readLine()!!.split(" ").map { it.toInt() }

    val sorted = times.sorted()

    println(sorted[0] + sorted[1])
}
