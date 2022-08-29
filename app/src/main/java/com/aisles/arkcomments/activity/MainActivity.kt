package com.aisles.arkcomments.activity

import android.os.Bundle
import com.aisles.arkcomments.R
import com.aisles.arkcomments.base.BaseActivity


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        darkFont = true
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}