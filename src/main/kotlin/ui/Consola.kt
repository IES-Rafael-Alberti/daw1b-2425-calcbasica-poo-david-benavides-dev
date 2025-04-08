package org.example.ui

import org.example.model.Operadores
import java.util.*

class Consola : IEntradaSalida {

    private val scanner = Scanner(System.`in`)
    override fun mostrarMensaje(msj: String, pausa: Boolean, limpiar: Boolean) {
        if (pausa) {
            pausar()
        }
        if (limpiar) {
            limpiarTerminal()
        }
        println(msj)
    }

    override fun mostrarError(msj: String, msjError: String) {
        mostrarMensaje(msjError + msj)
    }

    override fun pedirOperador(): String {
        mostrarMensaje("Introduce un operador > ")
        val operador = scanner.nextLine()
        val resultado = Operadores.getOperador(operador) ?: throw IllegalArgumentException("Introduce un operador válido.")

        return resultado.operator
    }

    override fun pedirNumero(): Double {
        mostrarMensaje("Introduce un número > ")
        val entrada = scanner.nextLine()
        val numero = entrada.toDoubleOrNull() ?: throw IllegalArgumentException("Introduce un número válido.")

        return numero
    }

    private fun pausar() {
        readln()
    }

    private fun limpiarTerminal() {
        repeat(20) {
            println("\n")
        }
    }

    override fun pedirOpcion(): Boolean {
        mostrarMensaje("¿Desea realizar cálculos?")
        return when(scanner.nextLine().lowercase().trim()) {
            "s" -> true
            "n" -> false
            else -> false
        }
    }
}