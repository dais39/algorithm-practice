fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val a = (1..n).map{ readLine()!!.toInt()}

    val ans = mutableSetOf<Int>()
    for(i in a) {
        if (ans.contains(i)) {
            ans.remove(i)
            continue
        }
        ans.add(i)
    }

    println(ans.size)
}
