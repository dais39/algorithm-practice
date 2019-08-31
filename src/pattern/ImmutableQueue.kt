package pattern

interface ImmutableQueue<T> {

    fun queue(element: T): ImmutableQueue<T>

    fun dequeue(): ImmutableQueue<T>

    fun getElements(): List<T>
}

class ImmutableQueueImpl<T>(private val values: List<T> = emptyList()) : ImmutableQueue<T> {

    override fun queue(element: T): ImmutableQueueImpl<T> {
        return ImmutableQueueImpl(this.values + element)
    }

    override fun dequeue(): ImmutableQueue<T> {
        if (this.values.isEmpty()) throw UnsupportedOperationException("queue size is empty")
        return ImmutableQueueImpl(values.dropLast(1))
    }

    override fun getElements(): List<T> {
        return values
    }
}

fun main() {

    val queue = ImmutableQueueImpl<Int>()

    val queue1 = queue.queue(1)
    val queue2 = queue1.queue(2)
    val queue3 = queue2.queue(3)

    val queue4 = queue3.dequeue()

    println(queue4.getElements())
}
