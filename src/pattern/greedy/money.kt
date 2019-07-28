package pattern.greedy

/**
 * 蟻本 P42 硬貨の問題
 */
fun main(args: Array<String>) {

    val c = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    var a = readLine()!!.toInt()
    val v = arrayOf(1, 5, 10, 50, 100, 500)

    var ans = 0

    for(i in v.size - 1 downTo 0){
        val m = Math.min(a / v[i], c[i])
        ans += m
        a -= m * v[i]
    }

    println(ans)
}
