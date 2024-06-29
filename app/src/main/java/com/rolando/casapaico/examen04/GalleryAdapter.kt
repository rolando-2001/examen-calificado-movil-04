package com.rolando.casapaico.examen04

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rolando.casapaico.examen04.databinding.ListItemImgBinding
import java.io.File

class GalleryAdapter (private val fileArray: Array<File>):
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>(){
    class ViewHolder (private val binding:ListItemImgBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(file:File){
            Glide.with(binding.root)
                .load(file)
                .into(binding.localImg)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            GalleryAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(ListItemImgBinding.inflate(layoutInflater,
            parent,false))
    }

    override fun onBindViewHolder(holder: GalleryAdapter.ViewHolder,
                                  position: Int) {
        holder.bind(fileArray[position])
    }

    override fun getItemCount(): Int {
        return fileArray.size
    }


}