package atcoder.abc150

fun main(args: Array<String>) {
    val (k, x) = readLine()!!.split(" ").map { it.toInt() }

    if (500 * k >= x) println("Yes") else println("No")
}
