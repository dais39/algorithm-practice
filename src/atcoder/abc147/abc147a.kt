package atcoder.abc147

fun main(args: Array<String>) {

    val (a1, a2, a3) = readLine()!!.split(" ").map { it.toInt() }

    if(a1 + a2 + a3 >= 22) println("bust") else println("win")
}
