package com.example.calculator.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NumberInputField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String
) {
    OutlinedTextField(
        value = value,
        onValueChange = { input ->
            var sanitizedInput = input.filter { it.isDigit() || it == '.' || it == ',' }

            // Impede que o primeiro caractere seja "." ou ","
            if (sanitizedInput.startsWith(".") || sanitizedInput.startsWith(",")) {
                sanitizedInput = ""
            }

            // Permite apenas UM separador decimal (ou "." ou ",")
            if (sanitizedInput.count { it == '.' } > 1 || sanitizedInput.count { it == ',' } > 1) {
                sanitizedInput = value // Mantém o valor anterior válido
            }

            onValueChange(sanitizedInput)
        },
        label = { Text(label) },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = modifier
            .fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun NumberInputFieldPreview() {
    NumberInputField(
        value = "123",
        onValueChange = {},
        label = "Número 1"
    )
}
