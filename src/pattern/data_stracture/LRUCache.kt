package pattern.data_stracture

class LRUCache<K, V>(
    capacity: Int,
    private val limit: Int
) : LinkedHashMap<K, V>(capacity, 0.75f, true) {

    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
        return this.size > limit
    }
}

fun main(){

    val cache = LRUCache<String, String>(5, 5)

    cache["1"] = "one"
    cache["2"] = "two"
    cache["3"] = "three"
    println(cache)

    cache["4"] = "four"
    println(cache)

    cache["2"]
    println(cache)

    cache["5"] = "five"
    println(cache)
}
