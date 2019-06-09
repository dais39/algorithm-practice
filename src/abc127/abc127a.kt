package abc127

fun main(args: Array<String>) {

    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    when{
        a >= 13 -> println(b)
        a in (6..12) -> println(b/2)
        else -> println(0)
    }
}
