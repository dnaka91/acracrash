package com.example.acracrash

import android.app.Application
import android.content.Context
import org.acra.ktx.initAcra

class AcraApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        initAcra { }
    }
}