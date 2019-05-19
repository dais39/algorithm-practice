fun main(args: Array<String>) {

    val s = readLine()!!

    val (l, r) = s.chunked(2).map { it.toInt() }

    if (l in (1..12)) {
        if(r in (1..12)){
            println("AMBIGUOUS")
        }else{
            println("NA")
        }
    } else {
        when (r) {
            in (1..12) -> println("YYMM")
            else -> println("NA")
        }
    }
}

fun String.chunked(size: Int): List<String> {
    val nChunks = length / size
    return (0 until nChunks).map { substring(it * size, (it + 1) * size) }
}
