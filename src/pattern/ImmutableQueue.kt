package pattern

import java.lang.UnsupportedOperationException

class ImmutableQueue<T>(private val values: List<T> = emptyList()) {

    fun queue(element: T): ImmutableQueue<T>{
        return ImmutableQueue(this.values + element)
    }

    fun dequeue(): ImmutableQueue<T> {
        if(this.values.isEmpty()) throw UnsupportedOperationException("queue size is empty")
        return ImmutableQueue(values.dropLast(1))
    }

    fun getElements(): List<T>{
        return values
    }
}
