fun main(args: Array<String>) {

    val (n,x) = readLine()!!.split(" ").map { it.toInt() }
    val destinationList = readLine()!!.split(" ").map {Math.abs(it.toInt()-x)}
    destinationList.sorted()
    var ans = destinationList.first()
    destinationList.drop(1)
    destinationList.forEach {
       ans = euclidean(ans, it)
    }
    println(ans)
}

fun euclidean(divisor: Int, dividend: Int): Int {
    val r = divisor % dividend
    if (r == 0) {
        return dividend
    }
    return euclidean(dividend, r)
}
