package abc118

fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map{it.toInt()}

    val k = (1..n).map{ readLine()!!.split(" ").map { it.toInt() }.drop(1)}

    var list = k.first()
    for(i in k){
        list = i.intersect(list).toList()
    }

    println(list.size)
}
