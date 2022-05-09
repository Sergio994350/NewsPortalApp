package com.sergio994350.newsportalapp.ui

import androidx.lifecycle.ViewModel
import com.sergio994350.newsportalapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}