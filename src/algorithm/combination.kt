package algorithm
fun main() {
    val list = listOf(1,2,3)

    comb(list)
}

fun comb(list: List<Int>){
    if(list.size == 1) return

    for(i in 0 until list.size - 1){
        println("${list[0]}, ${list[i+1]}")
    }
    comb(list.drop(1))
    return
}

