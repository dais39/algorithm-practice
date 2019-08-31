package atcoder.t1pbc

fun main(args: Array<String>) {
    val xs = readLine()!!.split(" ").map { it.toInt() }
    val c = xs.last()

    if(xs.max() == c || xs.min() == c){
        println("No")
    }else{
        println("Yes")
    }
}
