package com.example.calculator.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OperatorButton(
    operator: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(64.dp) // Botão um pouco maior para melhor usabilidade
            .clip(RoundedCornerShape(16.dp)) // Cantos mais arredondados
            .background(if (isSelected) MaterialTheme.colorScheme.primary else Color(0xFF4E4E4E))
            .clickable { onClick() }
            .padding(4.dp)
    ) {
        Text(
            text = operator,
            fontSize = 28.sp, // Fonte maior para melhor visibilidade
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OperatorButtonPreview() {
    OperatorButton(operator = "+", isSelected = true, onClick = {})
}
