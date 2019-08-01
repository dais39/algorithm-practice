package abc113

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val (t, a) = readLine()!!.split(" ").map { it.toInt() }

    val h = readLine()!!.split(" ").mapIndexed { index, s -> index to s.toInt() }

    val ans = h.minBy { Math.abs(a - (t-it.second*0.006)) }!!

    println(ans.first+1)
}
