package com.example.myapplication.DI

import com.example.myapplication.Data.Car
import com.example.myapplication.MainActivity
import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car

    fun inject(mainActivity: MainActivity);
}