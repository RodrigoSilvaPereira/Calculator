package com.example.calculator.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator.ui.components.NumberInputField
import com.example.calculator.ui.components.OperatorButton
import com.example.calculator.ui.components.ResultDisplay
import com.example.calculator.ui.viewmodel.CalculatorViewModel

@Composable
fun CalculatorScreen(
    modifier: Modifier = Modifier,
    viewModel: CalculatorViewModel = viewModel()
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        Text(
            text = "Calculadora Simples",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        // Resultado
        ResultDisplay(result = viewModel.result)

        // Campos de entrada
        NumberInputField(
            value = viewModel.number1,
            onValueChange = { viewModel.onNumber1Change(it) },
            label = "Número 1"
        )

        NumberInputField(
            value = viewModel.number2,
            onValueChange = { viewModel.onNumber2Change(it) },
            label = "Número 2"
        )

        // Botões de operadores
        Text(
            text = "Selecione o operador",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            listOf("+", "-", "*", "/").forEach { operatorSymbol ->
                OperatorButton(
                    operator = operatorSymbol,
                    isSelected = operatorSymbol == viewModel.operator,
                    onClick = { viewModel.onOperatorChange(operatorSymbol) },
                    modifier = Modifier
                )
            }
        }

        // Botão de cálculo
        Button(
            onClick = { viewModel.calculateResult() },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = MaterialTheme.shapes.medium
        ) {
            Text(
                text = "Calcular",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview() {
    CalculatorScreen()
}
