package atcoder.abc135

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val a = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    var ans = 0L

    for(i in 0 until n){
        val left = Math.min(a[i], b[i])
        ans += left
        a[i] -= left
        b[i] -= left

        val right = Math.min(a[i+1], b[i])
        ans += right
        a[i+1] -= right
    }

    println(ans)
}
