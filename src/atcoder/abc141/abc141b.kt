package atcoder.abc141

fun main(args: Array<String>) {

    val s = readLine()!!

    for(i in s.indices){
        if(i % 2 == 0){
            if(!(s[i] == 'R' || s[i] == 'U' || s[i] == 'D')) {
                println("No")
                return
            }
            continue
        }
        if(!(s[i] == 'L' || s[i] == 'U' || s[i] == 'D')) {
            println("No")
            return
        }
    }
    println("Yes")
}
