package atcoder.abc158

fun main(args: Array<String>) {
    val (n, a, b) = readLine()!!.split(" ").map { it.toLong() }
    val r = n / (a + b)
    val m = n % (a + b)
    var ans = r * a
    ans += if (m > a) a else m
    println(ans)
}
