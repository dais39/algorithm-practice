package abc132

fun main(args: Array<String>) {

    val c = readLine()!!.split("").filterNot { it.isBlank() }.toTypedArray()

    if(c.distinct().size == 1){
        println("No")
        return
    }

    if(c[0] == c[1] && c[2] == c[3] || c[0] == c[2] && c[1] == c[3] || c[0] == c[3] && c[1] == c[2]){
        println("Yes")
    }else{
        println("No")
    }
}
