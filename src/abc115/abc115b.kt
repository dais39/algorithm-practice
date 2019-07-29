package abc115

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val p = (1..n).map { readLine()!!.toInt() }

    val sortedList = p.sortedDescending()
    var ans = sortedList.first() / 2

    val remain = sortedList.drop(1)

    ans += remain.sum()
    println(ans)
}
