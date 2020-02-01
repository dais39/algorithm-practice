package atcoder.abc151

fun main(args: Array<String>) {

    val (N, K, M) = readLine()!!.split(" ").map{it.toInt()}
    val sum = readLine()!!.split(" ").map { it.toInt() }.sum()

    val rest = N * M - sum

    if(K < rest) {
        println(-1)
        return
    }

    if(rest >= 0) {
        println(rest)
        return
    }

    println(0)
}
