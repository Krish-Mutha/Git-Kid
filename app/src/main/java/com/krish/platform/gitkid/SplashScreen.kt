package com.krish.platform.gitkid

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.krish.platform.gitkid.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {

    companion object {
        private const val DELAY_TIME_IN_MILLS = 4000L
    }

    private lateinit var dataBind: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBind = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)
        dataBind.textGitCommand.text = Html.fromHtml(
            resources.getString(R.string.git_command_explorer))
        dataBind.textGitCommand2.text = Html.fromHtml(
                    resources.getString(R.string.git_command_explorer2))



        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, DELAY_TIME_IN_MILLS)
    }
}
