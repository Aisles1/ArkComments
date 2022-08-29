package com.aisles

import android.app.Application
import android.util.Log
import com.tencent.mmkv.MMKV

class ArkApp : Application() {

    companion object {
        const val TAG: String = "ArkApp"
    }

    override fun onCreate() {
        super.onCreate()
        initMMKV()
    }

    private fun initMMKV() {
        val rootDir = MMKV.initialize(this)
        Log.d(TAG, "initMMKV: $rootDir")
    }
}