package atcoder.abc128

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val rs = (1..n).mapIndexed { index, i ->
        val (s, p) = readLine()!!.split(" ")
        Triple(index+1, s, p.toInt())
    }

    val sorted = rs.sortedBy { it.second }

    for (city in sorted.map { it.second }.distinct()) {
        sorted.filter { it.second == city }.sortedByDescending { it.third }.forEach {
            println(it.first)
        }
    }

    // AtCoderのKotlin 1.0.0環境ではcompareByが動作しないが以下でもできる
    rs.sortedWith(compareBy({it.second}, {it.third * -1})).forEach { println(it.first) }
}
