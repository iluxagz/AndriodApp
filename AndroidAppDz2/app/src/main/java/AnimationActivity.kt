package by.iluxaz.androidapp

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.animation_layout.*

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation_layout)

        var catAnimation: AnimationDrawable

        catAnim.apply {
            setBackgroundResource(R.drawable.cat_animation)
            catAnimation = background as AnimationDrawable
        }
        catAnimation.start()
    }

}


