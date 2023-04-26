package com.example.viewmodelfabricdagger.PRESENTATION

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelfabricdagger.DATA.DI.DaggerViewModelFactory
import com.example.viewmodelfabricdagger.DATA.DI.MyComponent
import com.example.viewmodelfabricdagger.R
import com.example.viewmodelfabricdagger.databinding.ActivityMainBinding
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var map: Map<String, String>

    @Inject
    lateinit var set: Set<String>

    @Inject
    lateinit var viewModelDaggerFactory: DaggerViewModelFactory
    lateinit var binding: ActivityMainBinding
    lateinit var myComponent: MyComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent = (applicationContext as App).myComponent
        myComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e("AAA", "Activity Created")
        val viewModel = ViewModelProvider(this, viewModelDaggerFactory).get(MyViewModel::class.java)

        println(set)
        println(map)
    }
}