fun main(args: Array<String>) {
    // 入力値の最大値が10^15でInt(2^32)が使えないのでLong(2^64)で計算する
    val n = readLine()!!.toLong()
    val plist = (1..5).map { readLine()!!.toLong() }

    val min = plist.min()!!

    val c = if((n % min).toInt() == 0) n/min - 1 else n/min
    println(5 + c)
}
