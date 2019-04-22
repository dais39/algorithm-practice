fun main(args: Array<String>) {
    val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }
    if(A*C <= B) println(C) else println(B/A)
}
