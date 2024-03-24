package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        val Openbutton = findViewById<Button>(R.id.Openbutton)

        Openbutton.setOnClickListener {
            when (radioGroup.checkedRadioButtonId) {
                R.id.radioButton2 -> {
                    val goSecond = Intent(this, MainActivity2::class.java)
                    startActivity(goSecond)

                }

                R.id.radioButton3 -> {
                    val goThird = Intent(this, MainActivity3::class.java)
                    startActivity(goThird)


                    finish()

                }
            }
        }
    }
}
