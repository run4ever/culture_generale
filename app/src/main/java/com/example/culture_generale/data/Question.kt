package com.example.culture_generale.data

data class Question(
    val text: String,
    val options: List<String>,
    val correctIndex: Int,
    val rating: Int,
    val explanation: String
)