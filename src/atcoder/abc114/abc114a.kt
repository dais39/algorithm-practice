package atcoder.abc114

fun main(args: Array<String>) {
    val x = readLine()!!.toInt()

    println(if (listOf(3, 5, 7).any { it == x }) "YES" else "NO")
}
