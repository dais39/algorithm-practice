package atcoder.abc157

fun main(args: Array<String>) {

    val t1 = readLine()!!.split(" ").map { it.toInt() }
    val t2 = readLine()!!.split(" ").map { it.toInt() }
    val t3 = readLine()!!.split(" ").map { it.toInt() }

    val t4 = listOf(t1[0], t2[0], t3[0])
    val t5 = listOf(t1[1], t2[1], t3[1])
    val t6 = listOf(t1[2], t2[2], t3[2])

    val t7 = listOf(t1[0], t2[1], t3[2])
    val t8 = listOf(t1[2], t2[1], t3[0])

    val N = readLine()!!.toInt()
    val b = (1..N).map { readLine()!!.toInt() }

    val t = listOf(t1, t2, t3, t4, t5, t6, t7, t8)

    val answer = if (t.any { b.containsAll(it) }) "Yes" else "No"

    println(answer)
}
