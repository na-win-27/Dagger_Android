package com.example.myapplication.Data

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine,private val wheels: Wheels){
  fun drive(){
      Log.d("navin", "drivetrain: ")
  }
}