package atcoder.abc140

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val aList = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val bList = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val cList = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    // 初回
    var ans = bList[aList[0]-1]

    // 2回目以降
    for (i in 1 until n) {

        ans += bList[aList[i] - 1]

        if (aList[i] == aList[i - 1] + 1) {
            ans += cList[aList[i] - 2]
        }
    }

    println(ans)
}
