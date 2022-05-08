package com.sergio994350.newsportalapp

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)