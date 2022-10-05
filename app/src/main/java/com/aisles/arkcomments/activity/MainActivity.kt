package com.aisles.arkcomments.activity

import android.os.Bundle
import com.aisles.arkcomments.base.BaseActivity
import com.aisles.arkcomments.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        darkFont = true
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}