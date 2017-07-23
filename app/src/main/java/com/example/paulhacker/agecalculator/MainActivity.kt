package com.example.paulhacker.agecalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAge.text = ("")

    }

    fun CalculateAge(view: View) {
        if (etBirth.text.toString().trim().isEmpty() ) {
            etBirth.error = ("Bhai aur uske bahno fill this ")
        } else {
            val dob: String = (etBirth.text.toString())
            val curnt = Calendar.getInstance().get(Calendar.YEAR)
            val age = curnt - dob.toInt()
            tvAge.text = ("Your age is $age")
        }
    }


}
