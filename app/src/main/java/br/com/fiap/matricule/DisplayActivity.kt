package br.com.fiap.matricule

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        tvAluno.text = intent.getStringExtra("nome")
        tvCurso.text = intent.getStringExtra("classe")
    }
}
