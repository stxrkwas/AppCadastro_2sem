package com.example.appcadastro

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?){

        // Instancia o ciclo de vida da execução, ou seja, cria o método que apresenta a Activity
        super.onCreate(savedInstanceState)
        Toast.makeText(this,"Bem-vindo a aula de PAM2.", Toast.LENGTH_SHORT).show()
        val view = TextView(this)
        view.setText("Frutas")
        setContentView(R.layout.activity_main)
    }
}