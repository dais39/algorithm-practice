package abc135

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if((a + b) % 2 == 0){
        println((a + b) / 2)
    }else {
        println("IMPOSSIBLE")
    }
}
