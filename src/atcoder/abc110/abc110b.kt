package atcoder.abc110

fun main(args: Array<String>) {

    val (n, m, x, y) = readLine()!!.split(" ").map { it.toInt() }

    val xlist = readLine()!!.split(" ").map { it.toInt() }
    val ylist = readLine()!!.split(" ").map { it.toInt() }

    var isWar = false

    for (i in (x + 1..y)) {

        if (xlist.all { it < i } && ylist.all { it >= i }) {
            isWar = false
            break
        }
        isWar = true
    }

    if (isWar) {
        println("War")
    } else {
        println("No War")
    }
}
