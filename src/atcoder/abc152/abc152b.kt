package atcoder.abc152

fun main(args: Array<String>) {

    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (a > b) {
        println((1..a).map { b }.joinToString(""))
    } else {
        println((1..b).map { a }.joinToString(""))
    }
}
