package abc117

fun main(args: Array<String>) {
    readLine()
    val ls = readLine()!!.split(" ").map { it.toInt() }
    val max = ls.max()!!
    println(if(ls.sum() - max > max) "Yes" else "No")
}
