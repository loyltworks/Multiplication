package com.example.mulplicationlibrary

object FactorialValue {

    fun getFactorialValue(inputNumber: Int): Long {

        var factorialValue = inputNumber.toLong()

        for (i in factorialValue downTo 2) {

            factorialValue *= i - 1

        }
        return factorialValue
    }
}