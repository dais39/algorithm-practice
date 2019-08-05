package abc136

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    var ans = 0

    for(i in 1..n){
        if (i.toString().length % 2 == 1) ans++
    }

    println(ans)
}
