package pattern.algorithm

fun main(args: Array<String>) {

    // 初期化
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    val ans = if (a > b) euclidean(a, b) else euclidean(b, a)

    println(ans)
}

/**
 * ユークリッドの互除法
 * 2つの自然数(a>=b)において、aのbによる剰余をrとすると、aとbとの最大公約数はbとrとの最大公約数に等しい
 */
private fun euclidean(divisor: Int, dividend: Int): Int {
    val r = divisor % dividend
    if (r == 0) {
        return dividend
    }
    return euclidean(dividend, r)
}
