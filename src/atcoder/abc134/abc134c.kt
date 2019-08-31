package atcoder.abc134

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val a = (1..n).map { readLine()!!.toInt() }.toTypedArray()
    val b = a.copyOf()
    b.sortDescending()
    val firstMax = b[0]
    val secondMax = b[1]

    for (i in 0 until n) {
        if (a[i] < firstMax) {
            println(firstMax)
        } else {
            println(secondMax)
        }
    }
}
