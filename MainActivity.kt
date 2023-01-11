package com.example.surprise_eggs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.surprise_eggs.adapter.HippoAdapter
import com.example.surprise_eggs.data.DataSource
import com.example.surprise_eggs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main)



        val dataSource = DataSource()
        val hippolist = dataSource.getHippos()

        binding.hippoRecycler.adapter = HippoAdapter(this, hippolist)

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.hippoRecycler)

    }
}