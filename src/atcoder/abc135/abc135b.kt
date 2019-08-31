package atcoder.abc135

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val a = (1..n).map { it }.toTypedArray()

    var c = 0
    for(i in 0 until n){
        if(p[i] != a[i]) c++
    }

    println(if(c == 2 || c == 0) "YES" else "NO")
}
