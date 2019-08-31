package atcoder.abc138

fun main(args: Array<String>) {

    val (n, q) = readLine()!!.split(" ").map { it.toInt() }

    val parent = IntArray(n)
    val ki = IntArray(n)

    repeat(n - 1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        parent[b - 1] = a - 1
    }

    repeat(q) {
        val (p, x) = readLine()!!.split(" ").map { it.toInt() }
        ki[p - 1] = ki[p - 1] + x
    }

    for (i in 1 until n) {
        ki[i] += ki[parent[i]]
    }

    println(ki.joinToString(" "))
}

