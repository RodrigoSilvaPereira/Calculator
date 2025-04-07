package com.example.calculator.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.calculator.ui.utils.CalculatorUtils

class CalculatorViewModel : ViewModel() {

    var number1 by mutableStateOf("")
        private set

    var number2 by mutableStateOf("")
        private set

    var operator by mutableStateOf("")
        private set

    var result by mutableStateOf("")
        private set

    fun onNumber1Change(newValue: String) {
        number1 = newValue
    }

    fun onNumber2Change(newValue: String) {
        number2 = newValue
    }

    fun onOperatorChange(newOperator: String) {
        operator = newOperator
    }

    fun calculateResult() {
        result = CalculatorUtils.calculate(number1, number2, operator)
    }

    fun clearAll() {
        number1 = ""
        number2 = ""
        operator = ""
        result = ""
    }
}
