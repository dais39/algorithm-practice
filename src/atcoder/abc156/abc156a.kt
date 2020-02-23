package atcoder.abc156

fun main(args: Array<String>) {

    val (N, R) = readLine()!!.split(" ").map { it.toInt() }

    if(N >= 10) println(R) else println(R + 100 * (10 - N))
}
