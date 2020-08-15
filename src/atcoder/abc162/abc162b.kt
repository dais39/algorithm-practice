package atcoder.abc162

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val ans = (1..n)
            .asSequence()
            .map { it.toLong() }
            .filterNot { it % 15 == 0L }
            .filterNot { it % 5 == 0L }
            .filterNot { it % 3 == 0L }
            .sum()
    println(ans)
}
