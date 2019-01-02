package com.example.ahmetfatih.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ahmetfatih.swoosh.Controller.Utilities.Bilgibir
import com.example.ahmetfatih.swoosh.Controller.Utilities.Bilgiiki
import com.example.ahmetfatih.swoosh.R
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {

    var gelen = ""
    var gelenler = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        gelen = intent.getStringExtra(Bilgiiki)

        ben.text = "I am a :$gelen"
    }

    fun onFinishClicked(view: View){
        if (gelenler != ""){
            val sonAktivite = Intent(this, FinishActivity::class.java)
            sonAktivite.putExtra(Bilgibir, gelenler)
            sonAktivite.putExtra(Bilgiiki, gelen)
            startActivity(sonAktivite)
        }else{
            Toast.makeText(applicationContext,"Lütfen Seçim Yapınız",Toast.LENGTH_LONG).show()
        }
    }

    fun onBeginnerClicked(view: View){
        butonBaller.isChecked = false
        gelenler = "Beginner"
    }

    fun onBallerClicked(view: View){
        buttonBeginner.isChecked = false
        gelenler = "Baller"
    }
}
