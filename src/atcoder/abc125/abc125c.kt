package atcoder.abc125

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val a = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    val lcs = Array(n + 1) { 0 }
    for (i in 1..n) {
        lcs[i] = gcd(lcs[i - 1], a[i - 1])
    }

    val rcs = Array(n + 2) { 0 }
    for (i in n downTo 1) {
        rcs[i] = gcd(rcs[i + 1], a[i - 1])
    }

    val ans = (1..n).map { gcd(lcs[it - 1], rcs[it + 1]) }.max()
    println(ans)
}

fun gcd(a: Int, b: Int): Int {

    if (b == 0) {
        return a
    }

    return gcd(b, a % b)
}
