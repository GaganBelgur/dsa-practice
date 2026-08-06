package test.java.com.gaganbelgur.dsa.stackqueue.queuetostack

import main.java.com.gaganbelgur.dsa.stackandqueue.queuetostack.ImplementStackUsingQueueImpl
import org.junit.Assert.assertEquals
import org.junit.Test

class ImplementStackUsingQueueTest {

    private val implementStackUsingQueueImpl = ImplementStackUsingQueueImpl()

    @Test
    fun test() {
        implementStackUsingQueueImpl.push(1)
        implementStackUsingQueueImpl.push(2)
        implementStackUsingQueueImpl.push(3)

        assertEquals(3, implementStackUsingQueueImpl.top())
    }
}