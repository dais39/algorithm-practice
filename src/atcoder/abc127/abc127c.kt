package atcoder.abc127

fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val cardPassGateList = (1..m).map { readLine()!!.split(" ").map { it.toInt() } }

    val l = cardPassGateList.maxBy { it.first() }?.first()!!
    val r = cardPassGateList.minBy { it.last() }?.last()!!

    if(r < l){
        println(0)
        return
    }
    var ans = 0
    for(i in 1..n){
        if(i in (l..r)) ans++
    }
    println(ans)
}
