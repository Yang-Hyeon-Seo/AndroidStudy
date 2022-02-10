package com.example.gdschackertonprojects

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast

class Registration3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration3)

        //registration1페이지로 이동하기 위한 인덴트 생성
        val previousStepIntent = Intent(this, Registration2::class.java)
        val previousButton: Button = findViewById(R.id.previousStep3)
        previousButton.setOnClickListener {
            startActivity(previousStepIntent)
        }
        //registration3페이지로 이동하기 위한 인덴트 생성
        val mainPageIntent = Intent(this, MainPage::class.java)
        val nextButton: Button = findViewById(R.id.nextStep3)
        nextButton.setOnClickListener {
            //getMessage()
            val toast = Toast.makeText(this, "수고하셨습니다!", Toast.LENGTH_SHORT)
            toast.show()
            startActivity(mainPageIntent)
        }
        var targetDayButton = findViewById<RadioGroup>(R.id.targetDayButtons)
        targetDayButton.setOnCheckedChangeListener (var group: RadioGroup!, var checkedId: Int) {
            RadioGroup.OnCheckedChangeListener() {
            fun onCheckedChanged(group: RadioGroup!, checkedId: Int) {

            }
        })

/*
            when (targetDayButton.checkedRadioButtonId)
            {

            }

            public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch(checkedId){
                //선택된 라디오버튼에 해당하는 색상으로 글자색상바꾸기
                case R.id.rbRed:txt.setTextColor(Color.RED);break;
                case R.id.rbGreen:txt.setTextColor(Color.GREEN);break;
                case R.id.rbBlue:txt.setTextColor(Color.BLUE);break;
        }
*/

        }


            private fun getMessage() {
                var targetDayButton = findViewById<RadioGroup>(R.id.targetDayButtons)
                var targetDayOfWeek = targetDayButton.checkedRadioButtonId.

                //var targetDayString = targetDayOfWeek.
                //targetDayOfWeek.toString()

                //var morningTime = findViewById<CheckBox>(R.id.breakfast)



/*
                var intent_for_save: Intent = Intent(this, MainPage::class.java)
                intent_for_save.putExtra("targetDayOfWeek", targetDayOfWeek)
*/
            }
        }

}