package com.fernandobarbosa.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btFindMyAge(view : View) {
        if (!txtYearOfBirth.text.isEmpty()) {
            val yearOfBirth : Int = txtYearOfBirth.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = currentYear - yearOfBirth
            tvShowAge.text = "You have $myAge years old"
        }
    }
}
