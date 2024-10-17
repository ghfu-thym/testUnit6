package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun divTest(){
        val a=4
        val b=2
        assertEquals(2, div(a,b))
    }
    @Test
    fun divTest2(){
        val a=5
        val b=0
        assertEquals("ERROR", div(a,b))
    }
}