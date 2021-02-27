package com.example.ivirus

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ivirus.model.Sintoma
import com.example.ivirus.model.Usuario

class SintomasAdapter(private val listaSintomas: MutableList<Sintoma>) : RecyclerView.Adapter<SintomasAdapter.SintomaHolder>(){

    class SintomaHolder(view: View) : RecyclerView.ViewHolder(view){
        val sintoma: TextView = view.findViewById(R.id.edt_sintoma)
        val dataInicio: TextView = view.findViewById(R.id.edt_dInicio)
        val dataTermino: TextView = view.findViewById(R.id.edt_dTermino)
        val Intensidade: TextView = view.findViewById(R.id.edt_intensidade)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SintomaHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_resumo, parent, false)

        return SintomaHolder(view)
    }

    override fun onBindViewHolder(holder: SintomaHolder, position: Int) {
        holder.sintoma.text = listaSintomas[position].sintoma
        holder.dataInicio.text = listaSintomas[position].dataInicio
        holder.dataTermino.text = listaSintomas[position].dataTermino
        holder.Intensidade.text = listaSintomas[position].Intensidade
    }

    override fun getItemCount(): Int {
        return listaSintomas.size
    }

}