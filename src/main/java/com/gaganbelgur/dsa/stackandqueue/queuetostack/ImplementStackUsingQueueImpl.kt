package main.java.com.gaganbelgur.dsa.stackandqueue.queuetostack

import java.util.LinkedList
import java.util.Queue

class ImplementStackUsingQueueImpl: ImplementStackUsingQueueInterface {
    private val queue: Queue<Int> = LinkedList()

    override fun push(num: Int) {
        queue.add(num)
        val size = queue.size
        for (i in 0 until size - 1) {
            queue.add(queue.remove())
        }
    }

    override fun pop(): Int = queue.remove()

    override fun isEmpty() = queue.isEmpty()

    override fun top(): Int = queue.peek()
}