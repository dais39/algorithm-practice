package atcoder.abc111

fun main(args: Array<String>) {

    val n = readLine()!!

    var ans = ""

    for (i in 0 until n.length) {
        ans += if (n[i] == '1') "9" else "1"
    }

    println(ans)
}
