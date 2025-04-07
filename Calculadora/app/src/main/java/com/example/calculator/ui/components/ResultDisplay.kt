package com.example.calculator.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ResultDisplay(
    result: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFF2C2C2C)) // Fundo escuro para destacar o resultado
            .padding(16.dp),
        contentAlignment = Alignment.CenterEnd
    ) {
        Text(
            text = result.ifEmpty { "0" }, // Se o resultado for vazio, mostra "0"
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.End,
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ResultDisplayPreview() {
    ResultDisplay(result = "123.45")
}
