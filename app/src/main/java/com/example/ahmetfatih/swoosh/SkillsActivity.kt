package com.example.ahmetfatih.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillsActivity : BaseActivity() {

    var gelen = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

         gelen = intent.getStringExtra("lig")

        Toast.makeText(applicationContext,gelen,Toast.LENGTH_LONG).show()


    }
}
