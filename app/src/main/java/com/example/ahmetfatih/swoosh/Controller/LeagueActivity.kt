package com.example.ahmetfatih.swoosh.Controller

import android.os.Bundle
import android.content.Intent
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.ahmetfatih.swoosh.Controller.Model.Oyuncu
import com.example.ahmetfatih.swoosh.Controller.Utilities.EXTRA_PLAYER
import com.example.ahmetfatih.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player = Oyuncu("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun mensClicked(view : View){
        WomansButton.isChecked = false
        Co_edButton.isChecked = false
        player.lig = "Mens"
    }

    fun womansClicked(view : View){
        MensButton.isChecked = false
        Co_edButton.isChecked = false
        player.lig= "Womans"
    }

    fun coEdClicked(view : View){
        WomansButton.isChecked = false
        MensButton.isChecked = false
        player.lig = "Co-Ed"
    }


    fun nextClicked(view : View){
        if (player.lig != "") {
            val skillsIntent = Intent(this, SkillsActivity::class.java)
            skillsIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillsIntent)
        }else{
            Toast.makeText(applicationContext,"Please Select League", Toast.LENGTH_LONG).show()
        }
    }
}
