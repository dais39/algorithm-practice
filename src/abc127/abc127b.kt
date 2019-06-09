package abc127

fun main(args: Array<String>) {

    val (r, d, x2000) = readLine()!!.split(" ").map { it.toInt() }

    var x = x2000
    for(i in 1..10){
        val ans = r * x - d
        println(ans)
        x = ans
    }
}
