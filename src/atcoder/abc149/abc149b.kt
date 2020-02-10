package atcoder.abc149

fun main(args: Array<String>) {

    val (A, B, K) = readLine()!!.split(" ").map { it.toLong() }

    if (K > A + B) {
        println("0 0")
        return
    }

    if (K < A) {
        println("${A - K} $B")
        return
    }

    println("0 ${A + B - K}")
}
