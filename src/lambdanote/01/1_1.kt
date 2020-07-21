package lambdanote.`01`

fun main() {

    val n = readLine()!!.toInt()
    val lines = (0 until n).map { readLine()!! }

    lines.reversed().forEach {
        println(it)
    }
}