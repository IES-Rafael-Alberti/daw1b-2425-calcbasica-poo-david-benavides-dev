package org.example.model

class Calculadora : ICalculadora {
    override fun sumar(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    override fun restar(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    override fun multiplicar(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    override fun dividir(num1: Double, num2: Double): Double {
        return num1 / num2
    }
}