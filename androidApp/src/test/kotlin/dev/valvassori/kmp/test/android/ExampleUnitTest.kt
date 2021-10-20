package dev.valvassori.kmp.test.android

import dev.valvassori.kmp.test.Platform
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    private val sut = Platform()

    @Test
    fun platform_returnsCorrectName() {
        val name = sut.platform
        assertEquals(name, "Android")
    }
}
