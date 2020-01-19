package atcoder.abc150

var permList = mutableListOf<String>()

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val PN = readLine()!!.split(" ").joinToString("")
    val QN = readLine()!!.split(" ").joinToString("")

    perm(N)

    val a = permList.indexOf(PN) + 1
    val b = permList.indexOf(QN) + 1

    println(Math.abs(a - b))
}

fun perm(n: Int) {
    val c = (1..n).toList()
    val p = emptyList<Int>()
    perm(c, p)
}

fun perm(c: List<Int>, p: List<Int>) {
    if (c.isEmpty()) {
        permList.add(p.joinToString(""))
        return
    }
    for (e in c) {

        val newC = c.minusElement(e)
        val newP = p.plusElement(e)

        perm(newC, newP)
    }
}
