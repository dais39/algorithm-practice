package atcoder.abc157

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()

    if (N % 2 == 0) println(N / 2) else println(N / 2 + 1)
}
