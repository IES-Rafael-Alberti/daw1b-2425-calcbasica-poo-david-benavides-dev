package org.example.service

import org.example.model.ICalculadora

class ServicioCalc(private val calc: ICalculadora) {
    fun sumar(num1: Double, num2: Double): Double {
        return calc.sumar(num1, num2)
    }

    fun restar(num1: Double, num2: Double): Double {
        return calc.restar(num1, num2)
    }

    fun multiplicar(num1: Double, num2: Double): Double {
        return calc.multiplicar(num1, num2)
    }

    fun dividir(num1: Double, num2: Double): Double {
        return calc.dividir(num1, num2)
    }
}