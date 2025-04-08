package com.example.calculator.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.calculator.ui.utils.CalculatorUtils

class CalculatorViewModel : ViewModel() {

    //Chamamos as variáveis privadas
    var number1 by mutableStateOf("")
        private set

    var number2 by mutableStateOf("")
        private set

    var operator by mutableStateOf("")
        private set

    var result by mutableStateOf("")
        private set

    // Funções para quando digitar o valor ele pegar o novo valor digitado
    fun onNumber1Change(newValue: String) {
        number1 = newValue
    }

    fun onNumber2Change(newValue: String) {
        number2 = newValue
    }

    fun onOperatorChange(newOperator: String) {
        operator = newOperator
    }

    //Função para calcular o resultado, puxando lá do Utils
    fun calculateResult() {
        result = CalculatorUtils.calculate(number1, number2, operator)
    }

    // Função para limpar tudo, talvez eu faça um botão de Clear
    fun clearAll() {
        number1 = ""
        number2 = ""
        operator = ""
        result = ""
    }
}
