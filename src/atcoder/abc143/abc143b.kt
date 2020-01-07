package atcoder.abc143

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val dList = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    var ans = 0
    for (i in 0 until N) {
        for (j in i until N) {
            if (i == j) continue
            ans += dList[i] * dList[j]
        }
    }

    println(ans)
}
