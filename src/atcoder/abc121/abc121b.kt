package atcoder.abc121

fun main(args: Array<String>) {
    val (N, M, C) = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val aList = (1..N).map { readLine()!!.split(" ").map { it.toInt() }.toTypedArray() }

    var count = 0

    for(a in aList){

        var sum = 0
        for(i in 0 until M){
            sum += a[i]*b[i]
        }
        sum += C

        if(sum > 0) count++
    }

    println(count)
}
