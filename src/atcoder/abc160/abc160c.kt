package atcoder.abc160

fun main(args: Array<String>) {

    val (k, n) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    var b = mutableListOf<Int>()
    for(i in a.indices){
        val d = if(i == a.size - 1) k-a[i]+a[0] else a[i+1] - a[i]
        b.add(d)
    }

    val max = b.max()!!
    println(b.sum() - max)
}
