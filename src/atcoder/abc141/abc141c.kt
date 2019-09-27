package atcoder.abc141

fun main(args: Array<String>) {

    val (N, K, Q) = readLine()!!.split(" ").map { it.toInt() }

    val points = Array(N){K-Q}

    for(i in 0 until Q){
        val a = readLine()!!.toInt()
        points[a-1]++
    }

    points.forEach {
        if(it > 0) println("Yes") else println("No")
    }
}
