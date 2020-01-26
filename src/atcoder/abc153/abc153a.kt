package atcoder.abc153

fun main(args: Array<String>) {

    val (H, A) = readLine()!!.split(" ").map { it.toInt() }

    if (H % A == 0) println(H / A) else println(H / A + 1)
}
