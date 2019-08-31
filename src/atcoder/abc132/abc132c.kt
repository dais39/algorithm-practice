package atcoder.abc132

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val d = readLine()!!.split(" ").map { it.toInt() }.sorted().toTypedArray()

    val l = d[n/2 - 1]
    val r = d[n/2]

    println(r-l)
}
