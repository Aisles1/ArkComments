package com.aisles.arkcomments.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gyf.immersionbar.ktx.immersionBar

open class BaseActivity : AppCompatActivity() {

    //文本是否显示为深色
    var darkFont = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //沉浸式状态栏
        immersionBar {
            this.transparentBar()
            this.transparentStatusBar()
            this.transparentNavigationBar()
            this.statusBarDarkFont(darkFont)
        }
    }

}