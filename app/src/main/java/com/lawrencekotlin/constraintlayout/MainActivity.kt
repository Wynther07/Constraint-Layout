package com.lawrencekotlin.constraintlayout

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.cornerRadius = 15f
        //rounded.isCircular = true //means the object will become circular
        logo.setImageDrawable(rounded)
    }
}
