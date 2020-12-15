package com.example.calculadoraimc

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private var mCalculator: Calculator? = null

    /**
     * Set up the environment for testing
     */
    @Before
    fun setUp() {
        mCalculator = Calculator()
    }

    /**
     * Test for simple addition
     */
    @Test
    fun multTwoNumbers() {
        val resultMult = mCalculator!!.mul(1.70, 1.70)
        assertThat(resultMult, `is`(equalTo(2.89)))
    }
    @Test
    fun divTwoNumbers() {
        val resultDiv = mCalculator!!.div(78.0, 2.89)
        assertThat(resultDiv, `is`(equalTo(26)))
    }
}