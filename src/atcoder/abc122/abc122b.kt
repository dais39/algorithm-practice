package atcoder.abc122

fun main(args: Array<String>) {
    val sl = readLine()!!.split("")
    var max = 0
    var c = 0

    for(i in 0 until sl.size){
        val tmpl = sl.drop(i)
        val count = check(tmpl, c)
        if(max < count){
            max = count
        }
        if(tmpl.size <= max)break
    }
    println(max)
}

fun check(sl: List<String>, c: Int): Int{
    var c0 = c
    if(isACGT(sl.first())){
        c0 += 1
        c0 = check(sl.drop(1), c0)
    }
    return c0
}

fun isACGT(s: String) = when(s){
    "A", "C", "G", "T" -> true
    else -> false
}
