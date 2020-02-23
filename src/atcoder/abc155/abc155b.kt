package atcoder.abc155

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val aList = readLine()!!.split(" ").map { it.toInt() }

    val isApproved = aList.filter { it % 2 == 0 }.all { it % 3 == 0 || it % 5 == 0 }

    if (isApproved) println("APPROVED") else println("DENIED")
}
