package com.onursumakoglu.landmarkbookkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.onursumakoglu.landmarkbookkotlin.adapter.LandmarkAdapter
import com.onursumakoglu.landmarkbookkotlin.R
import com.onursumakoglu.landmarkbookkotlin.databinding.ActivityMainBinding
import com.onursumakoglu.landmarkbookkotlin.model.Landmark

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val amsterdam = Landmark("Amsterdam", "Netherlands", R.drawable.amsterdam)
        val milano = Landmark("Milano", "Italy", R.drawable.milano)

        landmarkList.add(pisa)
        landmarkList.add(amsterdam)
        landmarkList.add(milano)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

    }
}