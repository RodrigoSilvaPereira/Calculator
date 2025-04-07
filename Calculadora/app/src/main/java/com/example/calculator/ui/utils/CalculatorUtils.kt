package com.example.calculator.ui.utils

import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

object CalculatorUtils {
    private const val INVALID_INPUT = "Entrada inválida"
    private const val DIVISION_BY_ZERO = "Divisão por zero"
    private const val INVALID_OPERATION = "Operação inválida"

    fun calculate(number1: String?, number2: String?, operator: String?): String {
        val cleanedNumber1 = number1?.trim()?.replace(",", ".")
        val cleanedNumber2 = number2?.trim()?.replace(",", ".")
        val op = operator?.trim()

        if (cleanedNumber1.isNullOrEmpty() || cleanedNumber2.isNullOrEmpty()) {
            return INVALID_INPUT
        }

        val n1 = cleanedNumber1.toBigDecimalOrNull()
        val n2 = cleanedNumber2.toBigDecimalOrNull()

        if (n1 == null || n2 == null) {
            return INVALID_INPUT
        }

        return when (op) {
            "+" -> (n1 + n2).formatResult()
            "-" -> (n1 - n2).formatResult()
            "*" -> (n1 * n2).formatResult()
            "/" -> {
                if (n2.compareTo(BigDecimal.ZERO) == 0) DIVISION_BY_ZERO
                else n1.divide(n2, 25, RoundingMode.HALF_UP).formatResult()
            }
            else -> INVALID_OPERATION
        }
    }

    private fun BigDecimal.formatResult(): String {
        return try {
            val absValue = this.abs()
            val needsScientificNotation = absValue >= BigDecimal("1E10") || (absValue < BigDecimal("1E-10") && this != BigDecimal.ZERO)

            if (needsScientificNotation) {
                // Notação científica com 10 casas decimais
                val scientificFormat = DecimalFormat("0.########E0")
                scientificFormat.format(this.setScale(10, RoundingMode.HALF_UP))
            } else {
                // Exibe número normal com até 10 casas decimais
                this.setScale(10, RoundingMode.HALF_UP)
                    .stripTrailingZeros()
                    .toPlainString()
            }
        } catch (e: Exception) {
            this.toPlainString()
        }
    }


}
