package com.example.myapplication.DI

import com.example.myapplication.Data.Car
import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car
}