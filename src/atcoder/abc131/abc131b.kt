package atcoder.abc131

fun main(args: Array<String>) {

    val (n, l) = readLine()!!.split(" ").map { it.toInt() }

    val tastes = (1..n).map { l + it - 1 }
    val expect = tastes.sum()

    val eat = tastes.map { i -> Math.abs(i) }.min()!!

    if(expect >= 0) println(expect - eat) else println(expect + eat)
}
