package abc120

fun main(args: Array<String>) {
    val s = readLine()!!
    var b = s.filter { it == '0' }.count()

    if(b > s.length / 2) println(2 * (s.length - b)) else println(2 * b)
}
