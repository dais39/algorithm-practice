fun main(){

    val n = readLine()!!.toInt()
    var result = 1

    for(i in n downTo 1){
        result *= i
    }

    println(result)
}
