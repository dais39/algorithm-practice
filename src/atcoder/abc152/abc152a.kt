package atcoder.abc152

fun main(args: Array<String>) {

    val (N, M) = readLine()!!.split(" ").map { it.toInt() }

    if (N == M) println("Yes") else println("No")
}
