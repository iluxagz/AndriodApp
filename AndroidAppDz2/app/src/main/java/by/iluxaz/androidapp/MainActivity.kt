package by.iluxaz.androidapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Yo", "onCreate")

        button1.setOnClickListener {
            val intent = Intent(this, Button1Activity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent (this,Button2Activity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent (this,AnimationActivity::class.java)
            startActivity(intent)
        }
    }

}
