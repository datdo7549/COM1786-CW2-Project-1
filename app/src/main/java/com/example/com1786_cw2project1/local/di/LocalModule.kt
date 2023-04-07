package com.example.com1786_cw2project1.local.di

import com.example.com1786_cw2project1.feature.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val localModule = module {
    viewModel { HomeViewModel(get()) }
}