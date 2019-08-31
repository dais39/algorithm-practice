package atcoder.abc137

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val s = (1..n).map { readLine()!! }.toTypedArray()

    val map = mutableMapOf<String, Long>()

    var ans = 0L

    for (i in (0 until n)) {
        val sortedString = s[i].toList().sorted().toString()
        val count = map[sortedString]
        if (count != null) {
            ans += count
            map[sortedString] = count + 1L
        } else map[sortedString] = 1L
    }

    println(ans)
}
