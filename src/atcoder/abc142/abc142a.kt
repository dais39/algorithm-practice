package atcoder.abc142

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    if (n % 2 == 0) println((n / 2).toDouble() / n) else println((n / 2 + 1).toDouble() / n)
}
