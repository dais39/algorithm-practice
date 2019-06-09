package abc126

fun main(args: Array<String>) {

    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!.split("").toTypedArray()

    s.forEachIndexed { index, c ->
        if (index == k) print(c.toLowerCase()) else print(c)
    }
}
