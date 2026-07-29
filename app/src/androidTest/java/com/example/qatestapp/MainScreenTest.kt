package com.example.qatestapp

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    private lateinit var robot: MainScreenRobot

    @Test
    fun deveExibirSaudacaoParaAndroid() {
        robot = MainScreenRobot(composeTestRule)
        robot.verifyGreetingIsDisplayed("Hello Android!")
    }
}