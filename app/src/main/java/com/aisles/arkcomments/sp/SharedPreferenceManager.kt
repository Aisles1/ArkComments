package com.aisles.arkcomments.sp

import com.tencent.mmkv.MMKV

class SharedPreferenceManager private constructor() {

    private val kv by lazy {
        MMKV.defaultMMKV()
    }

    companion object {
        val instance: SharedPreferenceManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SharedPreferenceManager()
        }
    }


}