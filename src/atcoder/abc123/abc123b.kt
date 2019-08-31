package atcoder.abc123

fun main(args: Array<String>) {
    val foods = (1..5).map { readLine()!!.toInt() }.toIntArray()

    // 要素に9を足したものを10で割った余りが最小の要素を探す
    var min = Int.MAX_VALUE
    var lastfood = 0
    foods.forEach {
        val r = (it + 9) % 10
        if(min > r){
            min = r
            lastfood = it
        }
    }

    foods.set(foods.indexOfFirst { it == lastfood }, 0)

    println(foods.map { (it + 9)/10*10 }.sum() + lastfood)
}

