package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.DI.DaggerCarComponent
import com.example.myapplication.Data.Car

class MainActivity : AppCompatActivity() {

    lateinit var car:Car;

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component= DaggerCarComponent.create();
        car=component.getCar();

        car.drive();

}
}