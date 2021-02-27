package com.example.ivirus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val botaoCadastrar = findViewById<Button>(R.id.btn_commit)
        val nome = findViewById<EditText>(R.id.edt_cadastroNome)
        val email = findViewById<EditText>(R.id.edt_cadastroEmail)
        val senha = findViewById<EditText>(R.id.edt_cadastroSenha)
        val bairro = findViewById<EditText>(R.id.edt_cadastroBairro)
        val idade = findViewById<EditText>(R.id.edt_cadastroIdade)

        botaoCadastrar.setOnClickListener{
            val nomeDigitado = nome.text.toString()
            val emailDigitado = email.text.toString()
            val senhaDigitado = senha.text.toString()
            val bairroDigitado = bairro.text.toString()
            val idadeDigitado = idade.text.toString()

            if (nomeDigitado.isEmpty() || emailDigitado.isEmpty() || senhaDigitado.isEmpty() || bairroDigitado.isEmpty() || idadeDigitado.isEmpty()){
                Toast.makeText(this,"Algum campo está em branco!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show()
            }
        }
    }
}