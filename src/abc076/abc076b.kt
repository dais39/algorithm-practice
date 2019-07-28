package abc076

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    var ans = 1

    for (i in 1..n){
        ans = Math.min(ans * 2, ans+k)
    }

    println(ans)
}
