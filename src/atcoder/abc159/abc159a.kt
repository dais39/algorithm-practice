package atcoder.abc159

fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val nc = if (n < 2) 0 else (n * (n - 1) / 2)
    val mc = if (m < 2) 0 else (m * (m - 1) / 2)

    println(nc+mc)
}