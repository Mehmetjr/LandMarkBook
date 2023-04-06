package com.example.landmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook.databinding.ActivityDetailsBinding
import com.example.landmarkbook.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landMarkList : ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // data

        val pisa = LandMark("Pisa","Italy",R.drawable.pisatower)
        val colosseum = LandMark("Colosseum","İtaly",R.drawable.colosseum)
        val eiffel = LandMark("Eiffel","France",R.drawable.eiffel)
        val londonBridge = LandMark("London Bridge","England",R.drawable.londonbridge)
        val duomo = LandMark("Duomo di Florence","İtaly",R.drawable.duomodiflorence)

        landMarkList = ArrayList<LandMark>()
        landMarkList.add(pisa)
        landMarkList.add(colosseum)
        landMarkList.add(eiffel)
        landMarkList.add(londonBridge)
        landMarkList.add(duomo)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landMarkAdapter = LandMarkAdapter(landMarkList)
        binding.recyclerView.adapter = landMarkAdapter



    }
}