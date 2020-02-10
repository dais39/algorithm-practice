package atcoder.abc154

fun main(args: Array<String>) {

    val S = readLine()!!

    val answer = (1..S.length).map { 'x' }.joinToString(separator = "")

    println(answer)
}
