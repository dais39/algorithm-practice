package abc137

fun main(args: Array<String>) {

    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    val p = a + b
    val m = a - b
    val t = a * b

    println(listOf(p, m, t).max())
}
