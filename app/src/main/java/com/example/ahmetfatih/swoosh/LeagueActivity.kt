package com.example.ahmetfatih.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensClicked(view : View){
        WomansButton.isChecked = false
        Co_edButton.isChecked = false
        selectedLeague = "Mens"
    }

    fun womansClicked(view : View){
        MensButton.isChecked = false
        Co_edButton.isChecked = false
        selectedLeague = "Womans"
    }

    fun coEdClicked(view : View){
        WomansButton.isChecked = false
        MensButton.isChecked = false
        selectedLeague = "Co-Ed"
    }


    fun nextClicked(view : View){
        if (selectedLeague != "") {
            val skillsIntent = Intent(this, SkillsActivity::class.java)
            skillsIntent.putExtra("lig", selectedLeague)
            startActivity(skillsIntent)
        }else{
            Toast.makeText(applicationContext,"Please Select League", Toast.LENGTH_LONG).show()
        }
    }
}
