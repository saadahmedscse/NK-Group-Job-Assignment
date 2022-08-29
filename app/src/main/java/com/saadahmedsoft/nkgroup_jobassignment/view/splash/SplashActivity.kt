package com.saadahmedsoft.nkgroup_jobassignment.view.splash

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saadahmedsoft.base.helper.delay
import com.saadahmedsoft.nkgroup_jobassignment.R
import com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.DashboardActivity
import com.saadahmedsoft.shortintent.Anim
import com.saadahmedsoft.shortintent.ShortIntent

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        delay(500) {
            ShortIntent.getInstance(this)
                .addDestination(DashboardActivity::class.java)
                .addTransition(Anim.FADE)
                .finish(this)
        }
    }
}