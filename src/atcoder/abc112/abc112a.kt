package atcoder.abc112

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    when(n){
        1 -> println("Hello World")
        2 -> {
            val a = readLine()!!.toInt()
            val b = readLine()!!.toInt()
            println(a+b)
        }
    }
}
