package abc130

fun main(args: Array<String>) {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val ls = readLine()!!.split(" ").map { it.toInt() }

    var c = 1
    var sum = 0

    ls.forEach{
        sum += it
        if(sum > x) return@forEach
        c++
    }

    println(c)
}
