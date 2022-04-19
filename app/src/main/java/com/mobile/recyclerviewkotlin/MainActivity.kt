package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val handphoneList = listOf<Handphone>(
            Handphone(
                R.drawable.hp1,
                "samsung",
                "ram 8/128" +
                        "\n" +
                        "harga 2.499.999"
            ),
            Handphone(
                R.drawable.hp2,
                "oppo 2020",
                "ram 8/128" +
                        "\n" +
                        "harga 2.999.999"
            ),
            Handphone(
                R.drawable.hp3,
                "xiaomi",
                "ram 4/64" +
                        "\n" +
                        "harga 2.000.000"
            ),
            Handphone(
                R.drawable.hp4,
                "iphone",
                "ram 64" +
                        "\n" +
                        "harga 5.000.000"
            ),
            Handphone(
                R.drawable.hp5,
                "samsung A22",
                "ram 8/128" +
                        "\n" +
                        "harga 3.999.999"
            ),
            Handphone(
                R.drawable.hp6,
                "vivo",
                "ram 4/128" +
                        "\n" +
                        "harga 2.599.999"
            ),
            Handphone(
                R.drawable.hp7,
                "realme c2",
                "ram 4/64" +
                        "\n" +
                        "harga 1.999.999"
            ),
            Handphone(
                R.drawable.hp8,
                "iphone 13 pro max",
                "ram 256" +
                        "\n" +
                        "harga 15.000.000"
            ),
            Handphone(
                R.drawable.hp9,
                "iphone 8 plus",
                "ram 128" +
                        "\n" +
                        "harga 6.000.000"
            ),
            Handphone(
                R.drawable.hp10,
                "xiaomi 4a",
                "ram 2/64" +
                        "\n" +
                        "harga 1.999.999"
            )
            )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_handphone)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HandphoneAdapter(this, handphoneList){

            val intent = Intent (this, DetailHandphoneActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}