package com.yalemang.fastgoogleaddemo

import android.app.Application
import android.util.Log
import com.google.android.gms.ads.MobileAds


class App:Application() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(
            this
        ) {
            Log.d("mms","谷歌广告初始化完成")
        }
    }

}