package dev.valvassori.kmp.test

import kotlin.test.Test
import kotlin.test.assertTrue

class AndroidGreetingTest {
    @Test
    fun testExample() {
        assertTrue(
            Greeting().greeting().contains("Android"),
            "Check Android is mentioned"
        )
    }
}
