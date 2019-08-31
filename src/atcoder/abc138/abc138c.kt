package atcoder.abc138

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val v = readLine()!!.split(" ").map { it.toDouble() }.sorted().toTypedArray()

    for (i in 0 until n - 1) {
        v[i + 1] = (v[i] + v[i + 1]) / 2.0
    }

    println(v[n - 1])
}
