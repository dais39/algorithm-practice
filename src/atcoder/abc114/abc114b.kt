package atcoder.abc114

fun main(args: Array<String>) {
    val s = readLine()!!.split("").drop(1).dropLast(1)

    var min = Integer.MAX_VALUE
    for(i in (0 until s.size - 2)){
        val num = "${s[i]}${s[i+1]}${s[i+2]}".toInt()
        val diff = Math.abs(753 - num)
        if(min > diff) min = diff
    }

    println(min)
}
