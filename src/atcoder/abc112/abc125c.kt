package atcoder.abc112

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val info = (1..n).map { readLine()!!.split(" ").map { it.toInt() }.toTypedArray() }

    for (cx in 0..100) {
        for (cy in 0..100) {

            val (x, y, h) = info.first { it[2] >= 1 }
            val H = Math.abs(x - cx) + Math.abs(y - cy) + h
            val isans = info.all { it[2] == Math.max(H-Math.abs(it[0] - cx) - Math.abs(it[1] - cy), 0)}

            if(isans){
                println("$cx $cy $H")
                break
            }
        }
    }
}
