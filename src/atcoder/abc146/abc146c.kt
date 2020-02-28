package atcoder.abc146

fun main(args: Array<String>) {

    val (a, b, x) = readLine()!!.split(" ").map { it.toLong() }

    var l = 0L
    var r = 1000000001L

    while (r - l > 1) {
        val n = (l + r) / 2
        val yen = a * n + b * n.toString().length
        if (x >= yen) l = n else r = n
    }
    println(l)
}
