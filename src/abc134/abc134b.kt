package abc134

fun main(args: Array<String>) {

    val (n, d) = readLine()!!.split(" ").map { it.toInt() }

    println(if (n % (2 * d + 1) == 0) n / (2 * d + 1) else n / (2 * d + 1) + 1)
}
