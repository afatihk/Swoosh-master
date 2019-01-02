package com.example.ahmetfatih.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ahmetfatih.swoosh.Controller.Model.Oyuncu
import com.example.ahmetfatih.swoosh.Controller.Utilities.EXTRA_PLAYER
import com.example.ahmetfatih.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var player = Oyuncu("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
        textt.text = " Looking for ${player.lig} and ${player.skill} League near you..."
    }
}
