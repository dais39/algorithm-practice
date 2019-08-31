package atcoder.abc132

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    var c = 0
    for(i in 1 until n - 1){
        if(isSecond(s[i-1], s[i], s[i+1])) c++
    }
    println(c)
}

fun isSecond(n1: Int, n2: Int, n3: Int): Boolean{
    val list = listOf(n1, n2, n3)
    val sortedArray = list.sorted().toTypedArray()
    return sortedArray[1] == n2
}
