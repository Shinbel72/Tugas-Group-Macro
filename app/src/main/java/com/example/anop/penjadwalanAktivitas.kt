package com.example.anop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.EditText
import com.example.anop.databinding.ActivityPenjadwalanAktivitasBinding
import com.example.anop.databinding.ActivityPenjadwalanTugasBinding
import com.example.anop.databinding.ActivityRegisterBinding

class penjadwalanAktivitas : AppCompatActivity() {

    private lateinit var tBinding: ActivityPenjadwalanAktivitasBinding
    private lateinit var tJudul: EditText
    private lateinit var tDesc: EditText
    private lateinit var tKesulitan: EditText
    private lateinit var tKategori: EditText
    private lateinit var tDeadline: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tBinding = ActivityPenjadwalanAktivitasBinding.inflate(LayoutInflater.from(this))
        setContentView(tBinding.root)

        val items = listOf<String>("Ringan", "Sedang", "Kuat")
        val adapter = ArrayAdapter(this, R.layout.list_dropdown1, items)
        tBinding.dropdownIntensitas.setAdapter(adapter)

        val isi = listOf<String>("Fisik", "Rekreasi", "Pendidikan", "Sosial", "Kerja", "Kreatif", "Spiritual"
            , "Hobi", "Kesehatan & Perawatan", "Belanja", "Traveling", "Hiburan", "Pelayanan Masyarakat")
        val contact = ArrayAdapter(this, R.layout.list_dropdown1, isi)
        tBinding.dropdownKat.setAdapter(contact)
    }
}