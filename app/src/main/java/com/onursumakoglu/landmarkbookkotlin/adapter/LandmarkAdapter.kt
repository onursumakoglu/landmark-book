package com.onursumakoglu.landmarkbookkotlin.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onursumakoglu.landmarkbookkotlin.MySingleton
import com.onursumakoglu.landmarkbookkotlin.databinding.RecyclerRowBinding
import com.onursumakoglu.landmarkbookkotlin.model.Landmark
import com.onursumakoglu.landmarkbookkotlin.view.DetailsActivity

class LandmarkAdapter(val landmarkList : ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerViewText.text = landmarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            // intent.putExtra( "landmark", landmarkList.get(position))
            MySingleton.chosenLandmark = landmarkList.get(position)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

}