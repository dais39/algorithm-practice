package atcoder.abc130

fun main(args: Array<String>) {
    val (w, h, x, y) = readLine()!!.split(" ").map { it.toDouble() }

    val m = w.toLong() * h.toLong()

    val s = m / 2.0

    val r = if(x == w/2.0 && y == h/2.0) 1 else 0

    println("$s $r")
}
