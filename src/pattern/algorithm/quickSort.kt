package pattern.algorithm

fun quickSort(array: Array<Int>): Array<Int> {

    if (array.size == 1) return array

    val pivot = array[0]
    var left = 0
    var right = array.size - 1

    while (left < right) {

        while (array[left] < pivot) left++
        while (array[right] > pivot) right--

        if (left <= right) {
            val temp = array[left]
            array[left] = array[right]
            array[right] = temp

            left++
            right--
        }
    }

    val leftList = mutableListOf<Int>()
    val rightList = mutableListOf<Int>()
    for (i in 0 until left) {
        leftList.add(array[i])
    }
    for (i in left until array.size) {
        rightList.add(array[i])
    }

    println(leftList.joinToString(",", "[", "]"))
    println(rightList.joinToString(",", "[", "]"))

    return quickSort(leftList.toTypedArray()) + quickSort(rightList.toTypedArray())
}

fun main() {

    val array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    val sortedArray = quickSort(array)

    println(sortedArray.joinToString(",", "[", "]"))
}
