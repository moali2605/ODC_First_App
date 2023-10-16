package com.example.myapplication.persent.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.myapplication.R
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        lifecycleScope.launch {
            mainViewModel.phoneMutableLiveData.observe(this@MainActivity) {
                textView.text = getString(it.brandName)
            }
        }
    }
}
