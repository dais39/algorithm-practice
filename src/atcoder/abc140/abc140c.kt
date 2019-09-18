package atcoder.abc140

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    val c = Array(n) { 0 }

    // 先頭
    c[0] = b[0]

    for (i in 1 until n - 1) {
        c[i] = Math.min(b[i - 1], b[i])
    }
    // 最後
    c[n - 1] = b[n - 2]

    println(c.sum())
}
