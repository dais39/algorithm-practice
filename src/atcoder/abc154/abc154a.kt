package atcoder.abc154

fun main(args: Array<String>){

    val (S, T) = readLine()!!.split(" ")
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val U = readLine()!!

    if(S==U) println("${A-1} $B") else println("$A ${B-1}")
}
