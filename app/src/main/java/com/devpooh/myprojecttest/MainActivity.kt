package com.devpooh.myprojecttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Kraken", "생성완료")
        Log.d("SoureTree", "생성완료")
        Log.d("SoureTree", "생성완료2")

        var test1 = findViewById<Button>(R.id.test1)
        test1.setOnClickListener {
            Log.d("SoureTree", "버튼클릭1")
        }
    }
}