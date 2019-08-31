package atcoder.abc133

fun main(args: Array<String>) {

    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (n * a > b) println(b) else println(n*a)
}
