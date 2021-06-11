package com.example.videostreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        btn_1.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java )
            intent.putExtra("video" , 1)
            startActivity(intent)
        }

        btn_2.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java )
            intent.putExtra("video" , 2)
            startActivity(intent)
        }

        btn_3.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java )
            intent.putExtra("video" , 3)
            startActivity(intent)
        }

        btn_4.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java )
            intent.putExtra("video" , 4)
            startActivity(intent)
        }

    }
}