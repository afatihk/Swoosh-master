package com.example.ahmetfatih.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ahmetfatih.swoosh.Controller.Model.Oyuncu
import com.example.ahmetfatih.swoosh.Controller.Utilities.EXTRA_PLAYER
import com.example.ahmetfatih.swoosh.R
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {

    var player = Oyuncu("","")


    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        ben.text = "I am a :${player.lig}"
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onFinishClicked(view: View){
        if (player.skill != ""){
            val sonAktivite = Intent(this, FinishActivity::class.java)
            sonAktivite.putExtra(EXTRA_PLAYER, player)
            startActivity(sonAktivite)
        }else{
            Toast.makeText(applicationContext,"Lütfen Seçim Yapınız",Toast.LENGTH_LONG).show()
        }
    }

    fun onBeginnerClicked(view: View){
        butonBaller.isChecked = false
        player.skill = "Beginner"
    }

    fun onBallerClicked(view: View){
        buttonBeginner.isChecked = false
        player.skill = "Baller"
    }
}
