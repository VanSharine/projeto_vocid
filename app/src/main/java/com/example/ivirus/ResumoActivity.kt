package com.example.ivirus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ivirus.model.Sintoma
import kotlinx.android.synthetic.main.activity_resumo.*

class ResumoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo)


        val listaSintomas = mutableListOf<Sintoma>(
            Sintoma( sintoma = "Dor de cabeça", dataInicio = "QUA, 12 JAN DE 2019", dataTermino = "QUA, 12 JAN DE 2019",Intensidade = "5" ),
            Sintoma( sintoma = "Ansia", dataInicio = "QUI, 13 JAN DE 2019", dataTermino = "QUI, 13 JAN DE 2019",Intensidade = "3" ),
            Sintoma( sintoma = "Dor ", dataInicio = "SEX, 14 JAN DE 2019", dataTermino = "SEX, 14 JAN DE 2019",Intensidade = "1" )
        )

        val rvSintomas = findViewById<RecyclerView>(R.id.rvlistaSintomas)
        rvSintomas.adapter = SintomasAdapter(listaSintomas)
        rvSintomas.layoutManager = LinearLayoutManager(this)
    }
}