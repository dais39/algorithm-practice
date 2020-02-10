package atcoder.abc154

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val aList = readLine()!!.split(" ").map { it.toInt() }
    val uniqueAList = aList.distinct()

    if(aList.size == uniqueAList.size) println("YES") else println("NO")
}
