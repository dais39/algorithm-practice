package atcoder.abc145

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val S = readLine()!!

    val T = S.substring(0 until N / 2)

    if (S == T + T) println("Yes") else println("No")
}
