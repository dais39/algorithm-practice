package atcoder.abc152

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    var ans = 0
    var min = p[0]
    for (i in p.indices) {
        if (p[i] <= min) {
            ans++
            min = p[i]
        }
    }

    println(ans)
}
