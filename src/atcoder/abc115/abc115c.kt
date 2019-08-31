package atcoder.abc115

fun main(args: Array<String>) {

    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val h = (1..n).map { readLine()!!.toInt() }

    val selectedTree = h.sortedDescending().toTypedArray()

    var ans = Int.MAX_VALUE
    for (i in 0 .. n - k) {
        val max = selectedTree[i]
        val min = selectedTree[i + k - 1]

        if (max - min < ans) ans = max - min
    }

    println(ans)
}
