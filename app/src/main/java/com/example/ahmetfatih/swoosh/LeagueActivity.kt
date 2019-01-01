package com.example.ahmetfatih.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun nextClicked(view : View){
        val skillsIntent = Intent(this, SkillsActivity::class.java)
        startActivity(skillsIntent)
    }
}
