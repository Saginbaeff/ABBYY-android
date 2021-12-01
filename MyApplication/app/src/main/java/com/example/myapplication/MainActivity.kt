package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import android.content.Intent
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {

    private lateinit var mainCard: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Notes")
        val card = findViewById<CardView>(R.id.MainCard)
        card.setOnClickListener{
            it.startAnimation(AnimationUtils.loadAnimation(this, R.anim.card_click));
            val intent = Intent(this, DetailedViewActivity::class.java);
            startActivity(intent)
        }
        this.mainCard = card
    }

    override fun onDestroy() {
        this.mainCard.setOnClickListener(null)
        super.onDestroy()
    }

}