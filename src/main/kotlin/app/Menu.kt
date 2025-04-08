package org.example.app

import org.example.service.ServicioCalc
import org.example.ui.IEntradaSalida
import org.example.utils.Utils

class Menu(private val calculadora: ServicioCalc, private val consola: IEntradaSalida) {

    fun iniciar() {
        consola.mostrarMensaje("***CALCULADORA 3000***")
        var opcion = consola.pedirOpcion()

        while (opcion) {
            try {
                val num1 = consola.pedirNumero()
                val num2 = consola.pedirNumero()
                val operador = consola.pedirOperador()
                val resultado = when (operador) {
                    "+" -> calculadora.sumar(num1, num2)
                    "-" -> calculadora.restar(num1, num2)
                    "*" -> calculadora.multiplicar(num1, num2)
                    "/" -> calculadora.dividir(num1, num2)
                    else -> throw IllegalArgumentException("Operador no válido")
                }
                consola.mostrarMensaje(Utils.redondearNumero(resultado))
            } catch (e: IllegalArgumentException) {
                consola.mostrarError(e.message.toString())
            }
            opcion = consola.pedirOpcion()
        }
    }
}