package dev.valvassori.kmp.test

import android.net.Uri
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith
import kotlin.test.assertEquals

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(
            "dev.valvassori.kmp.test.test",
            appContext.packageName
        )
    }

    @Test
    fun parseUri() {
        val uri = Uri.parse("https://google.com")
        assertEquals("https", uri.scheme)
        assertEquals("google.com", uri.host)
    }
}
