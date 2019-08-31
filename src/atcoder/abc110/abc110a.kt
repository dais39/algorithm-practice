package atcoder.abc110

fun main(args: Array<String>) {

    val n = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()

    println(n[0] * 10 + n[1] + n[2])
}
