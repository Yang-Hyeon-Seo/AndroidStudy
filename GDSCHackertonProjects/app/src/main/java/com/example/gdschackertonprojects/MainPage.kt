package com.example.gdschackertonprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        //전달받은 데이터 참조
/*
        var edit_goal_value: String? = intent.getStringExtra("GoalStep")
        val goal_text = findViewById<TextView>(R.id.activity_get_step)
        goal_text.setText(edit_goal_value)
*/

        var edit_day_value: String? = intent.getStringExtra("targetDayOfWeek")
       /* val dayValue = when (edit_day_value) {
            "monday" -> "@string/Monday"
            "tuesday"-> "@string/Tuesday"
            "wednesday"->"@string/Wednsday"
            "thursday"->"@string/Thursday"
            "friday"->"@string/Friday"
            "saturday"->"@string/Saturday"
            "sunday" -> "@string/Sunday"
            else -> "오류"
        }*/
        //val dayValue : String = "화요일"
        val day_text = findViewById<TextView>(R.id.activity_get_day)
        day_text.setText("${edit_day_value}요일")

        //award페이지로 이동하기 위한 인덴트 생성
        val awardIntent = Intent(this, Award::class.java)
        val awardButton: Button = findViewById(R.id.awardButton)
        awardButton.setOnClickListener {
            startActivity(awardIntent)
        }

        //Write페이지로 이동하기 위한 인덴트 생성
        val writeIntent = Intent(this, WritePage::class.java)
        val writeButton: Button = findViewById(R.id.writeButton)
        writeButton.setOnClickListener {
            startActivity(writeIntent)
        }
    }
}