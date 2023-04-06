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
        val landmark = intent.getSerializableExtra("landmark") as LandMark
        binding.txtName.text = landmark.name
        binding.txtCountry.text = landmark.country
        binding.imageView.setImageResource(landmark.image)


/*
        val selectedLandMark = MySingleton.chosenLandMark

        selectedLandMark?.let {

            binding.txtName.text = it.name
            binding.txtCountry.text = it.country
            binding.imageView.setImageResource(it.image) }
*/

    }
}