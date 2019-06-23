package abc131

fun main(args: Array<String>) {

    val (a, b, c, d) = readLine()!!.split(" ").map { it.toLong() }

    val crb = b / c
    val drb = b / d
    val cdrb = b / ((c * d) / eucred(d, c))
    val bans = b - crb - drb + cdrb

    val cra = (a - 1) / c
    val dra = (a - 1) / d
    val cdra = (a - 1) / ((c * d) / eucred(d, c))
    val aans = a - 1 - cra - dra + cdra

    println(bans - aans)
}

fun eucred(n: Long, m: Long): Long {
    if (n % m == 0L) return m
    return eucred(m, n % m)
}
