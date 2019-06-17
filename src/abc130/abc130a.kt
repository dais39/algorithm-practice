package abc130

fun main(args: Array<String>) {
    val (x, a) = readLine()!!.split(" ").map { it.toInt() }
    println(if (x < a) 0 else 10)
}
