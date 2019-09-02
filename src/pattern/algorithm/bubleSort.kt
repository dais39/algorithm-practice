package pattern.algorithm

fun main() {

    val array = arrayOf(2, 5, 3, 2, 7, 3, 1)

    var i = 0
    while (i < array.size - 1) {
        var j = array.size - 1
        while (j > i) {
            if (array[j] < array[j - 1]) {
                val temp = array[j]
                array[j] = array[j - 1]
                array[j - 1] = temp
            }
            j--
            println(array.joinToString(",", "[", "]"))
        }
        i++
    }
}
