package com.self.splashscreen.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.self.splashscreen.MainActivity


@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //using launcher method to show splash screen for devices < Android 12

        // Navigate to the main activity after a delay or initialization
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}