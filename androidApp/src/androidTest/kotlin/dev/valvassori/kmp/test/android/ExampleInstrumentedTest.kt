package dev.valvassori.kmp.test.android

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun textView_rendersHelloAndroid() {
        Espresso.onView(withId(R.id.text_view))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hello, Android!")))
    }
}
