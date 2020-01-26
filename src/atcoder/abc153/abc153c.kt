package atcoder.abc153

fun main(args: Array<String>) {

    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val hList = readLine()!!.split(" ").map { it.toInt() }

    val sortedHList = hList.sortedDescending()
    val restHList = sortedHList.drop(K)
    val answer = restHList.map { it.toLong() }.sum()
    println(answer)
}
