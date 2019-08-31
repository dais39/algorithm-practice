package atcoder.abc131

fun main(args: Array<String>) {

    val c = readLine()!!.split("").toTypedArray()

    if (c[1] == c[2] || c[2] == c[3] || c[3] == c[4]) println("Bad") else println("Good")
}
