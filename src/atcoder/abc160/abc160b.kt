package atcoder.abc160

fun main(args: Array<String>) {

    val x = readLine()!!.toInt()

    val gohyaku = x/500
    val go = (x - gohyaku*500)/5

    println(1000*gohyaku+5*go)
}
