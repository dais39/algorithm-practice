package abc136

fun main(args: Array<String>) {

    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    println(if (a <= b + c) c - a + b else 0)
}
