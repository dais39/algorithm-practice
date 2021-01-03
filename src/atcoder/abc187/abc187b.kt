package atcoder.abc187

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val points: List<Pair<Int, Int>> = (0 until N).map {
        val point = readLine()!!.split(" ")
        Pair(point[0].toInt(), point[1].toInt())
    }

    var ans = 0

    for (i in 0 until N - 1) {
        for (j in i + 1 until N) {
            val xi = points[i].first
            val yi = points[i].second
            val xj = points[j].first
            val yj = points[j].second

            if (xi > xj) {
                val a: Double = (yi - yj).toDouble() / (xi - xj).toDouble()
                if (a >= -1 && a <= 1) ans++
            } else {
                val a: Double = (yj - yi).toDouble() / (xj - xi).toDouble()
                if (a >= -1 && a <= 1) ans++
            }
        }
    }

    println(ans)
}
