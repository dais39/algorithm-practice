package atcoder.abc120

fun main(args: Array<String>) {

    val (a, b, k) = readLine()!!.split(" ").map { it.toInt() }

    val an = (1..a).filter { a % it == 0 }
    val bn = (1..b).filter { b % it == 0 }

    val r = an.intersect(bn).sortedDescending()
    println(r[k-1])
}
