package atcoder.abc173

fun main() {

    val N = readLine()!!.toInt()

    val r = (1..N).map { readLine()!! }

    val l = mutableMapOf("AC" to 0, "WA" to 0, "TLE" to 0, "RE" to 0)

    r.forEach {
        val v = l[it]!!
        l[it] = v + 1
    }

    l.forEach {
        println("${it.key} x ${it.value}")
    }
}