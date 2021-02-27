package com.example.ivirus.model

import android.graphics.Bitmap


data class Usuario(var imagem: Bitmap? = null,
                   val nome: String,
                   val email: String,
                   val senha: String,
                   val bairro: String,
                   val idade: String
                   )