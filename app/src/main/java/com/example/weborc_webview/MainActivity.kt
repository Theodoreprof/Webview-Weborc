package com.example.weborc_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWeb = findViewById<WebView>(R.id.wb_webView)

        myWeb.apply {
            loadUrl("https://www.weborc.gr/")
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
        }

//        webViewSetup()
    }

//    private fun webViewSetup() {
//        wb_webView.webViewClient = WebViewClient()
//
//        wb_webView.apply {
//            loadUrl("https://www.weborc.gr/")
//            settings.javaScriptEnabled = true
//        }
//    }
}