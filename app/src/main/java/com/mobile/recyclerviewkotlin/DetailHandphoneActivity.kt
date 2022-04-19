package com.mobile.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailHandphoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_handphone)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val handphone = intent.getParcelableExtra<Handphone>(MainActivity.INTENT_PARCELABLE)

        val imgHandphone = findViewById<ImageView>(R.id.img_item_photo)
        val nameHandphone = findViewById<TextView>(R.id.tv_item_name)
        val descHandphone = findViewById<TextView>(R.id.tv_item_description)

        imgHandphone.setImageResource(handphone?.imgHandphone!!)
        nameHandphone.text = handphone.nameHandphone
        descHandphone.text = handphone.descHandphone
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}