package atcoder.abc162

fun main(args: Array<String>) {

    val k = readLine()!!.toInt()

    var ans = 0

    for (a in 1..k) {
        for (b in 1..k) {
            for (c in 1..k) {
                ans += gcd(a, b, c)
            }
        }
    }

    println(ans)
}

fun gcd(a: Int, b: Int, c: Int): Int {

    val d = if (a > b) {
        gcd(a, b)
    } else {
        gcd(b, a)
    }

    val ans = if (c > d) {
        gcd(c, d)
    } else {
        gcd(d, c)
    }

    return ans
}

fun gcd(a: Int, b: Int): Int {

    val r = a % b
    if (r == 0) {
        return b
    }

    return gcd(b, r)
}
