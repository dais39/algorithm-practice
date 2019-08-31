package atcoder.abc138

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val a = readLine()!!.split(" ").map { it.toDouble() }

    val inverseA = a.map { 1.0 / it }

    val m = inverseA.sum()

    println(1.0 / m)
}
