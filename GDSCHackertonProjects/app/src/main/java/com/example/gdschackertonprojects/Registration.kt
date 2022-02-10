package com.example.gdschackertonprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        //registration2페이지로 이동하기 위한 인덴트 생성
        val nextStepIntent = Intent(this, Registration2::class.java)
        val nextButton: Button = findViewById(R.id.nextStep3)
        nextButton.setOnClickListener {
            startActivity(nextStepIntent)
        }
    }

}