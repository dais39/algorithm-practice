package atcoder.msbc2019

fun main(args: Array<String>) {

    val (m1, d1) = readLine()!!.split(" ").map { it.toInt() }
    val (m2, d2) = readLine()!!.split(" ").map { it.toInt() }

    if (m1 != m2) println(1) else println(0)
}
