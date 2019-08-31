package atcoder.abc126

fun main(args: Array<String>) {

    val s = readLine()!!

    val (l, r) = s.chunked(2).map { it.toInt() }

    val yymm = r in (1..12)
    val mmyy = l in (1..12)

    if (yymm) {
        if(mmyy){
            println("AMBIGUOUS")
        }else{
            println("YYMM")
        }
    } else {
        if(mmyy){
            println("MMYY")
        }else{
            println("NA")
        }
    }
}

fun String.chunked(size: Int): List<String> {
    val nChunks = length / size
    return (0 until nChunks).map { substring(it * size, (it + 1) * size) }
}
