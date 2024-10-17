package com.example.myapplication

import androidx.compose.material3.Text
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myapplication.ui.theme.MyApplicationTheme

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myapplication", appContext.packageName)
    }
}

class MainActivityTest {

    @get:Rule
    var composeTestRule= createComposeRule()

    @Test
    fun test() {
        composeTestRule.setContent {
            MyApplicationTheme {
                DiceRollerApp()
            }
        }
        composeTestRule
            .onNodeWithText("Roll")
            .performClick()
        composeTestRule
            .onNodeWithText("Clicked")
            .assertExists()
    }
}
class Test2{
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testReuseNode() {
        composeTestRule.setContent {
            Text("testText")
        }

// Sử dụng SemanticsNodeInteraction để lưu vào một val
        val textView = composeTestRule.onNodeWithText("testText")

// Kiểm tra nội dung và hiển thị
        textView.assertTextEquals("testText")
        textView.assertIsDisplayed()



    }
}