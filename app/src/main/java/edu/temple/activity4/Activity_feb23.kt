package edu.temple.activity4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity_feb23 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feb23)


       val  newIntent= intent.getFloatExtra("key",4.4F)
      val  TextView1 = findViewById<TextView>(R.id.textView1)
        TextView1.textSize = newIntent


    }
}