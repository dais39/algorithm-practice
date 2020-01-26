package atcoder.abc153

fun main(args: Array<String>) {

    val (H, N) = readLine()!!.split(" ").map { it.toInt() }
    val aList = readLine()!!.split(" ").map { it.toInt() }

    val sum = aList.sum()
    if(H > sum) println("No") else println("Yes")
}
