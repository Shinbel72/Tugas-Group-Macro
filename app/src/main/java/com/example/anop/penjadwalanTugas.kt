package com.example.anop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.EditText
import com.example.anop.databinding.ActivityPenjadwalanTugasBinding
import com.example.anop.databinding.ActivityRegisterBinding

class penjadwalanTugas : AppCompatActivity() {

    private lateinit var tBinding: ActivityPenjadwalanTugasBinding
    private lateinit var tJudul: EditText
    private lateinit var tDesc: EditText
    private lateinit var tKesulitan: EditText
    private lateinit var tKategori: EditText
    private lateinit var tDeadline: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tBinding = ActivityPenjadwalanTugasBinding.inflate(LayoutInflater.from(this))
        setContentView(tBinding.root)

        val items = listOf<String>("Sangat Mudah", "Mudah", "Biasa Saja", "Sulit", "Sangat Sulit")
        val adapter = ArrayAdapter(this, R.layout.list_dropdown1, items)
        tBinding.dropdownKesulitan.setAdapter(adapter)

        val isi = listOf<String>("Pilihan Ganda", "Isian", "Essay", "Makalah", "Presentasi", "Laporan Praktikum", "Review Jurnal"
            , "Proyek", "Skripsi", "Lainnya")
        val contact = ArrayAdapter(this, R.layout.list_dropdown1, isi)
        tBinding.dropdownJob.setAdapter(contact)
    }
}