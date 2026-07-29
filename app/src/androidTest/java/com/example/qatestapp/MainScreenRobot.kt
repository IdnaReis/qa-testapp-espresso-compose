package com.example.qatestapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithText

class MainScreenRobot(private val composeTestRule: AndroidComposeTestRule<*, *>) {

    fun verifyGreetingIsDisplayed(expectedText: String) {
        composeTestRule.onNodeWithText(expectedText).assertIsDisplayed()
    }
}