package com.example.raymand_interview_task.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.raymand_interview_task.R

@Composable
fun SectionPartition(title: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = title, style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        ))
        Spacer(modifier = Modifier.width(10.dp))
        Divider(color = colorResource(id = R.color.dark_gray))
        Spacer(modifier = Modifier.height(50.dp))
    }
}