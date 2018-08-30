package cn.com.yyh.kotlinapp

import android.app.Activity
import android.os.Bundle

class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onBackPressed() {
        setResult(100)

        super.onBackPressed()
    }
}
