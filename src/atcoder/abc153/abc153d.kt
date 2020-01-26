package atcoder.abc153

fun main(args: Array<String>) {

    val N = readLine()!!.toLong()

    val answer = Math.pow(2.toDouble(), Math.floor(Math.log(N.toDouble()) / Math.log(2.toDouble())) + 1) - 1

    println(answer.toLong())
}
