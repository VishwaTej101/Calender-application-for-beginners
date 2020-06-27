package com.vishwa.calender

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.DatePicker
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val date=findViewById<DatePicker>(R.id.calenderView)as DatePicker
        val calender:Calendar= Calendar.getInstance()
        date.init(calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH),{view,year,monthOFYear,dayOfMonth->
            Toast.makeText(applicationContext,"#"+date.dayOfMonth+"-"+date.month+"-"+date.year+"#",Toast.LENGTH_SHORT).show()
        })
    }
}