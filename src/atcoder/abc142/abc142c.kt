package atcoder.abc142

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val a = readLine()!!.split(" ").map { it.toInt() }

    val aPair = a.mapIndexed { index, i -> Pair(index+1, i) }.sortedBy { it.second }

    aPair.forEach{
        print(it.first)
        print(" ")
    }
}
