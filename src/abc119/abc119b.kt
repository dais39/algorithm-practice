package abc119

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()

    val money = (1..N).map {
        val l = readLine()!!.split(" ")
        Pair(l[0].toDouble(), l[1])
    }

    val total = money.map {
        when(it.second) {
            "JPY"->{
                it.first
            }
            else ->{
                it.first*380000.0
            }
        }
    }.sum()

    println(total)
}
