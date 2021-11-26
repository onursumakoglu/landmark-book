package com.onursumakoglu.landmarkbookkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onursumakoglu.landmarkbookkotlin.MySingleton
import com.onursumakoglu.landmarkbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val selectedLandmark = MySingleton.chosenLandmark

        selectedLandmark?.let {
            binding.nameText.text = selectedLandmark.name
            binding.countryText.text = it.country
            binding.imageView.setImageResource(it.image)
        }

        /*
        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.nameText.text = selectedLandmark.name
        binding.countryText.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)

         */
    }
}