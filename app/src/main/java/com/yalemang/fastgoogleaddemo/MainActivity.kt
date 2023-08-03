package com.yalemang.fastgoogleaddemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError

class MainActivity : AppCompatActivity() {

    private lateinit var adView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adView = findViewById(R.id.adView)
        adView.adListener = object : AdListener() {
            override fun onAdFailedToLoad(p0: LoadAdError) {
                super.onAdFailedToLoad(p0)
                Log.d("mms", p0.message)
            }

            override fun onAdLoaded() {
                super.onAdLoaded()
                Log.d("mms", "onAdLoaded")
            }

            override fun onAdImpression() {
                super.onAdImpression()
                Log.d("mms", "onAdImpression")
            }

            override fun onAdClosed() {
                super.onAdClosed()
                Log.d("mms", "onAdClosed")
            }
        }
        val adRequest: AdRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }
}