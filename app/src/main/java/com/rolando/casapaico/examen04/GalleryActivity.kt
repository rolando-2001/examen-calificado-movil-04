package com.rolando.casapaico.examen04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rolando.casapaico.examen04.databinding.ActivityGalleryBinding
import java.io.File

class GalleryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGalleryBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val directory=File(externalMediaDirs[0].absolutePath)
        val files=directory.listFiles() as Array<File>

        val adapter=GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter=adapter

    }
}