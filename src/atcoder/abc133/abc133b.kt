package atcoder.abc133

fun main(args: Array<String>) {

    val (n, d) = readLine()!!.split(" ").map { it.toInt() }

    val xs = (1..n).map { readLine()!!.split(" ").map { it.toInt() }.toTypedArray() }.toTypedArray()

    var count = 0
    for(i in 0 until n-1){
        for(j in i+1 until n){
            var r = 0.0
            for(k in 0 until d){
                r += Math.pow((xs[j][k] - xs[i][k]).toDouble(), 2.0)
            }
            if(Math.sqrt(r) * 10.0 % 10.0 == 0.0) count++
        }
    }
    println(count)
}
