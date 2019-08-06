package abc111

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    var ans = 0
    for (i in n..999) {
        val c = i.toString()
        if (c[0] == c[1] && c[1] == c[2]){
            ans = i
            break
        }
    }

    println(ans)
}
