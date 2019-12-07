package atcoder.msbc2019

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val answer = (0..n).filter { Math.floor(it * 1.08).toInt() == n }

    if (answer.size == 0) println(":(") else println(answer.first())
}
