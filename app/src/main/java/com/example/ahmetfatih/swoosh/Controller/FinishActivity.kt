package com.example.ahmetfatih.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ahmetfatih.swoosh.Controller.Utilities.Bilgibir
import com.example.ahmetfatih.swoosh.Controller.Utilities.Bilgiiki
import com.example.ahmetfatih.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var gelenLigYazisi = ""
    var gelenKategori = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        gelenLigYazisi = intent.getStringExtra(Bilgibir)
        gelenKategori = intent.getStringExtra(Bilgiiki)
        textt.text = " Looking for $gelenKategori and $gelenLigYazisi League near you..."
    }
}
