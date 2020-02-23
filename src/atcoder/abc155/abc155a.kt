package atcoder.abc155

fun main(args: Array<String>) {

    val inputs = readLine()!!.split(" ")

    val result = inputs.distinct().size

    if(result == 2) println("Yes") else println("No")
}
