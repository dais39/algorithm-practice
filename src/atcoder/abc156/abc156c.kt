package atcoder.abc156

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val x = readLine()!!.split(" ").map { it.toInt() }

    var min = Int.MAX_VALUE

    for(p in 1..100){
        var sum = 0
        for(i in 0 until n){
            sum += (x[i] - p) * (x[i] - p)
        }
        if(sum < min) min = sum
    }

    println(min)
}
