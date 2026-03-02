package com.ssmj.calculatorapp01

class CalculatorEngine {

    fun calculate(a: Double, b: Double, op: String): Result<Double> {
        return try {
            val result = when (op) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "/" -> {
                    if (b == 0.0) throw ArithmeticException("Divide by zero")
                    a / b
                }
                else -> throw IllegalArgumentException("Invalid operator")
            }
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}