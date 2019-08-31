package atcoder.t1pbc

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val s = readLine()!!.split("").toTypedArray().drop(1).dropLast(1)
    val k = readLine()!!.toInt()
    val c = s[k-1]

    s.forEach { i ->
        if(i != c){
            print("*")
        }else{
            print(i)
        }
    }
}
