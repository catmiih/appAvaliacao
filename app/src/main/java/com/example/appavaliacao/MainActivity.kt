package com.example.appavaliacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTeste: Button = findViewById(R.id.btn)
        btnTeste.setOnClickListener{ Teste() }
    }

    private fun Teste() {
        val num1 : EditText = findViewById(R.id.valor1);
        val valor1 = Integer.parseInt(num1.text.toString());

        val num2 : EditText = findViewById(R.id.valor2);
        val valor2 = Integer.parseInt(num2.text.toString());

        if(num1.text.isNotEmpty() && num2.text.isNotEmpty()){
            if (valor1 > valor2) {
                Toast.makeText(this, "Campo 1 é maior do que campo 2", Toast.LENGTH_SHORT).show()
            }else if (valor1 == valor2) {
                Toast.makeText(this, "Campo 1 é igual ao campo 2", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Campo 1 é menor do que campo 2", Toast.LENGTH_SHORT).show()
            }
        }
    }
}