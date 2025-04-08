package org.example.utils

object Utils {
    fun redondearNumero(numero: Double, decimales: Int = 2): String {
        return String.format("%.${decimales}f", numero)
    }
}