package com.example.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
       // val selectedLandMark = intent.getSerializableExtra("landmark") as LandMark



        val selectedLandMark = MySingleton.chosenLandMark

        selectedLandMark?.let {

            binding.txtName.text = it.name
            binding.txtCountry.text = it.country
            binding.imageView.setImageResource(it.image) }


    }
}