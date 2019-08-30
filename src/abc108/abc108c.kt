package abc108

fun main(args: Array<String>) {

    val (n, k) = readLine()!!.split(" ").map { it.toInt() }

    // a, b, cがKの倍数の場合の数
    var count = 0L
    for (i in k..n step k) {
        count++
    }
    val ans1 = count * count * count

    // Kが偶数のとき、a+b, b+c, a+cがKの倍数の場合、
    // つまりa, b, cをKで割ったあまりが2/Kの場合の数
    var count2 = 0L
    if (k % 2 == 0) {
        count2 = (1..n).filter { it % k == k / 2 }.count().toLong()
    }
    val ans2 = count2 * count2 * count2

    println(ans1+ans2)
}
