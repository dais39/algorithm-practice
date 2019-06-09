package abc121

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toLong() }
    val storeList = (1..n).map { readLine()!!.split(" ").map { it.toLong() } }

    // 価格が安い順に店舗を並び替える O(n)
    val sortedStore = storeList.sortedBy { it.first()}

    // お店の最大本数よりも購入したい本数が
    // -> 少ない場合 購入したい本数*価格 を合計に足す O(n)
    // -> 多い場合 最大本数*価格を合計に足す 購入したい本数から最大本数を引く O(n)
    var wanted = m
    var total:Long = 0
    for(store in sortedStore){
        if(wanted < store[1]){
            total += store[0] * wanted
            break
        }else{
            total += store[0] * store[1]
            wanted -= store[1]
        }
    }

    println(total)
}
