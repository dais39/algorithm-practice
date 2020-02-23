package atcoder.abc155

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val sList = (1..N).map { readLine()!! }

    val map = mutableMapOf<String, Int>()
    for(i in sList){
        if(map[i] == null){
            map[i] = 1
        }else{
            map[i] = map[i]!! + 1
        }
    }

    val max = map.maxBy { it.value }!!.value
    val answer = map.filter { it.value == max }.toSortedMap()

    answer.forEach{
        println(it.key)
    }
}
