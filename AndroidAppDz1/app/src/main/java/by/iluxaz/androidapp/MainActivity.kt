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
            val intent = Intent(this, Click1Activity::class.java)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        Log.e("Yo", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yo", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yo", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Yo", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Yo", "onDestroy")
    }

}
