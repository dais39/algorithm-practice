package atcoder.abc137

fun main(args: Array<String>) {

    val (k, x) = readLine()!!.split(" ").map { it.toInt() }

    val ans = ((x - k + 1) until x+k).joinToString(" ")

    println(ans)
}
